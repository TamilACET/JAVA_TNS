package programs;

public class testsleep extends Thread{

	public void run()
	{
		System.out.println("running....");
	}

	public static void main(String[] args) {
		
		testsleep ts=new testsleep();
		ts.run();
	}

}
