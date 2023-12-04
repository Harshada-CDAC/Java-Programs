import java.util.Arrays;

public class sort_chracter_by_string {

	public static void main(String[] args) {
		String str="hello";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String ss=new String(ch);
		System.out.println(ss);
		
	}

}
