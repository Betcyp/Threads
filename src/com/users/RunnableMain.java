package com.users;

import com.runnable1.Runnable1;
import com.runnable1.Runnable2;
public class RunnableMain {
	public static void main(String[] args) {
		Runnable1 r1=new Runnable1();
		Thread t1=new Thread(r1,"thread1:");
		System.out.println(t1);
		t1.start();
		Runnable2 r2=new Runnable2();
		Thread t2=new Thread(r2,"thread2:");
		System.out.println(t2);
		t2.start();
	}
}
