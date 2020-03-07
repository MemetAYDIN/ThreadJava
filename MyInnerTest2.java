package com.godoro.Threads;

public class MyInnerTest2 {

	private static void goon() {
		while (true) {
			try {
				Thread.sleep(550);
				System.out.println("Sürüyor");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private static void work() {
		while (true) {
			try {
				Thread.sleep(500);
				System.out.println("Koşuyor");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				work();
			}

		};

		Thread thread = new Thread(runnable);
		thread.start();
		goon();

	}

}
