package programs;

public class mythread1 {

	public static void main(String[] args) {
		Thread t=new Thread("My 1st thread");
		t.start();
		String str=t.getName();
		System.out.println(" "+str);
		
	}

}
