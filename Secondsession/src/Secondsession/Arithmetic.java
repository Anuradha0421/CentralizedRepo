package Secondsession;

public class Arithmetic {
	
	
	public int sum(int a, int b)
	{
		c= a+b;
		System.out.println("sum is " +c);
		return c;
	}
	
	public int sub(int a, int b)
	{
		int c= a-b;
		System.out.println("Sub is " +c);
		return c;
	}
	public int Mul(int a, int b)
	{
		int c= a*b;
		System.out.println("multiplication is " +c);
		return c;

	}
	public void div(int a, int b)
	{
		int c= a/b;
		System.out.println("after divition result is " +c);
	}
	
	int c;
	public static void main(String[] args)
	{
     Arithmetic obj= new Arithmetic();
     int S = obj.sum(10, 2);
     int S1 = obj.sum(S, 2);
     int Sb = obj.sub(S1, 2);
     int M = obj.Mul( Sb, 2);
     obj.div(M, 2);
     
    
	}
}
