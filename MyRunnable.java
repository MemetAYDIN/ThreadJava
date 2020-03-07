package com.godoro.Threads;

public class MyRunnable implements Runnable{
	
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

}
