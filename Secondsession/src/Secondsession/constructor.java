package Secondsession;

public class constructor {
	public constructor() 
	{
		this(6, 7, 8, 9);
		System.out.println("Default constructor");
	
	}
	public constructor(int a) 
	{
		this();
		System.out.println("one parameterized constructor");
	
	}
	public constructor(int a, int b) 
	{
		this (6);
		System.out.println("Two parameterized constructor");
	
	}
	public constructor(int a, int b, int c) 
	{
		this(6, 7);
		System.out.println("Three parameterized constructor");
	
	}
	public constructor(int a, int b, int c, int d) 
	{
		System.out.println("Four parameterized constructor");
	
	}
	public static void main(String[] args ) {
		constructor co = new constructor (6, 7, 8);
	}
}
