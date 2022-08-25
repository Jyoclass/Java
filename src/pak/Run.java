package pak;

class A
{
	
	static void test(Object obj)
	{
		String classname=obj.getClass().toString();
		
		
		switch(classname)
		{
		case "java.lang.Integer":
			 int i= ((Integer)obj).intValue(); 
			 System.out.println(i);
			 break;
		case "java.lang.Double":	 
			 double d=((Double)obj).doubleValue();
			 System.out.println(d);
			 break;
		case "java.lang.String":
			String str=((String)obj).toString();
			System.out.println(str);
			break;
	   default:
		   System.out.println("Invalid input");
		
		
		}
		
	}
	
}
public class Run 

{

	public static void main(String[] args)
	{	
		Integer i1=new Integer(10); //boxing		
	    A.test(i1);
	    
	    Double d1=new Double(10.02);
	    A.test(d1);
	    
	    String str1=new String("Jimmy");
	    A.test(str1);
		
	
	}

}
