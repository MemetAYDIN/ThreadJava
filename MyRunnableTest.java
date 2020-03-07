package com.godoro.Threads;

public class MyRunnableTest {
	
	public static void main(String[] args) {
		
		MyRunnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
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
