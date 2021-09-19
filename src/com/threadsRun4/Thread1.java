package com.threadsRun4;

public class Thread1 extends Thread {
	private Thread t;
	private String threadName;
	
	public Thread1(String name)   {
		    threadName=name;
		    System.out.println(threadName+ " is created. ");
	}
	public void run() {
		System.out.println(threadName+ " is running. ");
		 try {
	         for(int i = 4; i>0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            Thread.sleep(50);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	}
	public void start() {
 		System.out.println(threadName+ " is starting. ");
		if (t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
	}
}
