package com.automation.samples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    WebElement mobile=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
	    Actions act=new Actions(driver);
	    act.contextClick(mobile).perform();
	    Robot rbt=new Robot();
	    rbt.keyPress(KeyEvent.VK_DOWN);
	    rbt.keyPress(KeyEvent.VK_DOWN);
	    rbt.keyPress(KeyEvent.VK_ENTER);
	    //*************************************************************
	    Thread.sleep(2000);
	    WebElement srch1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    srch1.sendKeys("Samsung Refrigirator");
	    Set<String> ids=driver.getWindowHandles();  
	    Iterator<String> it=ids.iterator();	    
	    String parentwindow=it.next();
	    String childwindow=it.next();	    
	    System.out.println(parentwindow);
	    System.out.println(childwindow);    
	    driver.switchTo().window(childwindow);
	    Thread.sleep(3000);
	    WebElement srch2=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    srch2.sendKeys("Lg refrigirator");
	   
	    
	}
	

}
