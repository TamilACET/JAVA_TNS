package programs;

public class mythread2 implements Runnable {

	public void run()
	{
		System.out.println("Now the thread is running....");
	}
	public static void main(String[] args) {
		Runnable r=new mythread2();
		Thread t=new Thread(r,"My 2nd thread");
		t.start();
		String str=t.getName();
		System.out.println(str);
	}

}
