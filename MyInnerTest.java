package com.godoro.Threads;

public class MyInnerTest {
	
	Runnable runnable=new Runnable()
	{
		
		@Override
		public void run() {
			
			while(true)
			{
				try {
					Thread.sleep(500);
					System.out.println("Koşuyor");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
	};
	
	
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
