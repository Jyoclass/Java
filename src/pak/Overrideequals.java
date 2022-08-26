package pak;


class Dog
{
	String name;
	
	Dog(String name)
	{
		this.name=name;
	}
	
	
	public boolean equals(Object obj) 
	{
	return	this.name.equals(((Dog)obj).name);
	}
	
}


public class Overrideequals {

	public static void main(String[] args)
	{
		Dog d1=new Dog("Browny");
		
		Dog d2=new Dog("Jimmy");
		
		System.out.println(d1.equals(d2));

	}

}
