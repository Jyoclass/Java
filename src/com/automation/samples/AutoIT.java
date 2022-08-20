package com.automation.samples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.findElement(By.xpath("//span[text()='Choose CV']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Upload.exe");

	}

}
