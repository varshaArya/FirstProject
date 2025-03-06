package Lambdaexp;

public class ThreadDriver extends Thread{

public static void main(String [] args) {

	System.out.println("main starts");
	Runnable r1 = ()-> System.out.println("Run is implemented");
	
	Thread thread = new Thread(r1);
	thread.start();
	System.out.println("main ends ");
}

	}


