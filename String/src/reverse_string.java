
public class reverse_string {

	public static void main(String[] args) 
	{
		String str="Harshada";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
			System.out.print(ch[i]);
		
	}
}

//String str="Harshada";
//StringBuilder sb=new StringBuilder();
//sb.append(str);
//sb.reverse();
//System.out.println(sb);





//		String str="Harshada";
//		char ch;
//		String reverse="";
//		System.out.println("reverse string is"+str);
//
//		for(int i=0;i<str.length();i++)
//		{
//			ch=str.charAt(i);
//			reverse=ch+reverse;
//		}
//		System.out.println("reverse string is"+reverse);
//	}

//}
