package programs;

public class StringExample {

	public static void main(String[] args) {
		String s1=" CSE ";
		char ch[]= {'s','t','r','i','n','g','s'};
		String s2=new String(ch);
		String s3=new String("Java Program is important");
		String line="cse";
		System.out.println(s3.charAt(6));
		System.out.println(s3.substring(5,12));
		System.out.println(s1.equals(line));
		System.out.println(s1.equalsIgnoreCase(line));
		System.out.println(s1.concat(s3));
		System.out.println(s1.replace('S','A'));
		System.out.println(s3.replace('a','e'));
		System.out.println(s3.replace("Java","Spring"));
		System.out.println(s3.indexOf("Program"));
		System.out.println(s1.trim());
		int n=50;
		String m=String.valueOf(n);
		System.out.println(m);
	}

}
