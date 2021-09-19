package com.referencethread3;

public class CurrentMethod {
	public static void main(String args[])
	{
	Thread t1 = Thread.currentThread();
	System.out.println ("current thread is:" +t1);
	System.out.println("Name of the current thread is:" +t1.getName());
	System.out.println ("Priority :" +t1.getPriority());
	t1.setName("mythread");
	System.out.println ("after the  name change:" +t1);
	t1.setPriority (2);
	System.out.println ("after the priority change:" +t1);
	System.out.println ("number of active thread is:" + Thread.activeCount());
	
	}
}
