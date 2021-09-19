package com.multithread5;
	
public class Multithreaded extends Thread
	{
	static String message [ ] = {"Java", "is", "aromatic",
	"and", "invigorating."};
	
	public Multithreaded(String id)
	{
	super (id);
	}
	public void run ( )
	{
	String name = getName ( );
	for (int i=0;i<message.length; ++i )
	{

	randomWait ( );
	System.out.println (name + message[i] );
	}
	}
	void randomWait ( )
	{
	try
	{
	sleep((long)(3000*Math.random ( ) ) );
	}
	catch (InterruptedException x )
	{
	System.out.println ("Interrupted!");
	}
	}
}

