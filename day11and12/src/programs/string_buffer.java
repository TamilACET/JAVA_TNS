package programs;

public class string_buffer {

	public static void main(String[] args) {
		
		StringBuffer line=new StringBuffer();
		System.out.println(line.capacity());
	
		System.out.println(line.capacity());
		line.ensureCapacity(50);
		System.out.println(line.capacity());
	}

}
