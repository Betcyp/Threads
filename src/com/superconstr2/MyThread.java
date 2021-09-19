package com.superconstr2;

public class MyThread extends Thread
{
	public MyThread()
	{
		super();
	    System.out.println ("Child thread:"+this);
	    start();
	}
	public void run()
	{
	try
	{
		for ( int i =0; i<=5; i++)
		{
			System.out.println ("Child thread" +i);
			Thread.sleep (500);
		}
	} 
	catch (InterruptedException e) { }
	System.out.println ("exiting child thread");
	}
}



