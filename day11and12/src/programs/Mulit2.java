package programs;

public class Mulit2 implements Runnable{

		public void run()
		{
			System.out.println("thread is running");
			System.out.println("Adding the line");
		}
		public static void main(String[] args) {
			Mulit2 m1=new Mulit2();
			Thread t1=new Thread(m1);
			t1.start();
		}	

	}


