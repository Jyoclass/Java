package Exception;


class InsufficientFund extends RuntimeException
{
	
	public String toString() 
	{
		return "Insuffient fund please maintain the balance";
	}
	
}





class Account
{
	double amount;
	
	Account(double amount)
	{
		this.amount=amount;
	}
	
	
	void deposit(double amt)
	{
		
		this.amount+=amt;
		System.out.println("Amount deposited successful "+amt);
	}
	void balance()
	{
		System.out.println("Current balance is "+this.amount);
	}
	void withdraw(double amt)
	{
		if(amt>this.amount)
		{
			throw new InsufficientFund();
		}
		else
		{
			this.amount-=amt;
			System.out.println("Amount withdrawn is  "+amt);
		}
		
		
	}
	
}

public class Run {

	
	
	public static void main(String[] args) 
	{
	  System.out.println("program starts");
		
	   Account acc1=new Account(10000);
	   acc1.balance();
	   acc1.withdraw(9000);
	   acc1.balance();
	   
	  System.out.println("Program ends");
	 
	}
	
	

}
