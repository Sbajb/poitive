package vakt;

public  class Practice {
	
	int num1;  //Global variable= inside the class outside the method
	int num2;
	int num3;
	
	final int a=10; // final keyword??
	int b=20;

	public static void main(String[] args) {
		 
		Namae("Name as string to be given"); 
		 
		Practice constructor= new Practice(20,30,40);
		constructor.abc(10,20);
		
		sum2(20,30);
		
		constructor.addition();
		
		
		constructor.subtraction();
		
		constructor.sum3(10,20);
		
		constructor.useGLobalvariable();
		 
		
}
	
	public  Practice(int a, int b,int c) //constructor :so by using constructor we can use same
    //variable and their values with multiple method
           
{
               num1=a;
               num2=b;
               num3=c;
}

	
	public static void Namae (String name) {
			System.out.println("student name is: " + name);
		}
	 
	 
	 public void abc(int a, int b) 
	 {
		 int sum;
		 sum=a+b;
		 System.out.println("addition is "+sum);
	 }
	 
	 
	 public static void sum2(int a, int b) 
	 {
		 int sum;
		 sum=a+b;
		 System.out.println("addition is "+sum);
	 }
	 
	
	public void addition ()
	{
		int sum= num1+num2+num3;
	    System.out.println("addition is by using constructor " +sum);
	}
	
	public void subtraction()
	{
	    int subtraction=num1-num2-num3;
		System.out.println("subtraction by using one constructor "+subtraction);
	}
	
	public void sum3(int a, int b) 
	 {
		 int sum;
		 sum=a+b;
		 System.out.println("addition is "+sum);
	 }
	 
	public void useGLobalvariable()
	{   int a=20;
		int sum =this.a+b;
		System.out.println("sum is "+sum);
	}
	
 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
