import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) 
	{
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string");
		String os=sc.nextLine();
		
		for(int i=os.length()-1;i>=0;i--) {
		reverse=reverse+os.charAt(i);
	}
	if(os.equals(reverse))
	{
		System.out.println("string is plaindrome");
	}
	else
		System.out.println("string is not  plaindrome");

	
	}
	
}
