package Secondsession;

public class const_n {
	public const_n()
	{
		this(20,40,60);
		System.out.println("Default constructor");
	}
	
	public const_n(int a)
	{
		this();
		System.out.println("one parameterized constructor");
	}
    public const_n(int a, int b)
    {
    	this(20);
    System.out.println("two parameterized constructor");
    }
    public const_n( int a, int b, int c)
    {
    	System.out.println("three parameterized constructor");
    }
    public const_n(int a, int b, int c, int d)
    {
    	this(20, 40);
    	System.out.println("four parameterized cunstructor");
    }
    public static void main( String[] args)
    {
    	const_n cn= new const_n (20,40,60, 80);

    }
}
