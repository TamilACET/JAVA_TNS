package programs;

public class TestPropagation1 {

	void function1()
	{
		int data=50/0;
	}
	void function2()
	{
		function1();
	}
	void function3()
	{
		try
		{
			function2();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
	
	public static void main(String[] args) {
		TestPropagation1 tp1=new TestPropagation1();
		tp1.function3();
		System.out.println("normal flow");
	}

}
