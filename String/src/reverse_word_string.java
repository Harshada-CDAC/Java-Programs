
public class reverse_word_string {

	public static void main(String[] args) {
		String str="Welcome To Home";
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
			System.out.println(s[i]);
	}

}
