package programs;

class Threadjoin1 extends Thread {

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			try
			{
				//Thread.sleep(300);
				System.out.println("thread name:"+Thread.currentThread().getName());
			}
			catch(Exception e)
			{
				System.out.println("The exception has been caught:"+e);
			}
			System.out.println(" "+i);
		}
	}
}G
public class Threadjoin
{
	public static void main(String[] args) 
	{
		Threadjoin1 th1=new Threadjoin1();
		Threadjoin1 th2=new Threadjoin1();
		Threadjoin1 th3=new Threadjoin1();
		th1.start();//Thread one started
		try
		{
			System.out.println(Thread.currentThread().getName());//main
			th1.join();//Thread one joining
		}
		catch(Exception e)
		{
			System.out.println("The exception has been caught"+e);
		}
		th2.start();//Thread two started
		try
		{
			System.out.println(Thread.currentThread().getName());
			th2.join();//Thread two joining
		}
		catch(Exception e)
		{
			System.out.println("The exception has been caught"+e);
		}
		th3.start();//Thread three joining
		try
		{
			System.out.println(Thread.currentThread().getName());
			th3.join();//Thread two joining
		}
		catch(Exception e)
		{
			System.out.println("The exception has been caught"+e);
		}
		
	}
}
