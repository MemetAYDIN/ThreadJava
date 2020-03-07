package com.godoro.Threads;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
		while(true)
		{
			try {
				Thread.sleep(550);
				System.out.println("Sürüyor");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	

}
