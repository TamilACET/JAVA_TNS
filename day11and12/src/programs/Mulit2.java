package programs;

public class Mulit2 implements Runnable{

		public void run()
		{
			System.out.println("thread is running");
		}
		public static void main(String[] args) {
			Mulit2 m1=new Mulit2();
			Thread t1=new Thread(m1);
			t1.start();
		}	

	}


