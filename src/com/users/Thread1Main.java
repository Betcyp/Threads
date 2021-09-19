package com.users;

import com.threadsRun4.Thread1;
public class Thread1Main {
	public static void main(String[] args) {
		Thread1 th1=new Thread1("Thread-1");
		th1.start();
		Thread1 th2=new Thread1("Thread-2");
		th2.start();
	}
}
