package Lambdaexp;

public class ThreadDriver2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Runnable r1 = ()-> {
			for(int i =0; i<=10; i++)
				System.out.println(Thread.currentThread().getName()+ "is running");
		};
		Thread thread = new Thread(r1);
		thread.setName("car");
		thread.start();
		System.out.println("main ends ");
	}

	

	}


