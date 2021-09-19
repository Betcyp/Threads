package com.runnable1;

public class Runnable2 implements Runnable {	
	public void run() {
		for(int i = 1;i<=5;i++)
		{
			try 
			{
				System.out.println("thread2:"+i);
				Thread.sleep(500);
			}
  			catch (InterruptedException e) {
				System.out.println("Thread is interrupted:"+e);
				e.printStackTrace();
			}
		}
	}
}
