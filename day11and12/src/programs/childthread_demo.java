package programs;
class threadchild extends Thread
{
	public void run()
	{
		System.out.println("running child....");
	}
}
public class childthread_demo {
	
	public static void main(String[] args) 
	{
			threadchild tc=new threadchild();
			tc.start();
			try
			{
				for(int i=0;i<5;i++)
				{
					Thread.sleep(500);
					System.out.println(i);
					tc.join();
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
	}

}
