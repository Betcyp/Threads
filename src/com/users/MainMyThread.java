package com.users;

import com.superconstr2.MyThread;

public class MainMyThread {
	public static void main(String args[])
	{ 
	new MyThread();
	try {
	for ( int i = 0; i <=5; i++)
	{
		System.out.println ("Running main thread :"+i);
		Thread.sleep(1000);
	}
	}catch (InterruptedException e) { }
		System.out.println ("Exiting main thread . . .");
	}
}
