
public class Replace_Character {

	public static void main(String[] args) 
	{
		String str="Geeks Gor Geeks";
		int index=6;
		char ch='F';
        System.out.println("Original String = " + str); 
		StringBuffer sb=new StringBuffer(str);
		sb.setCharAt(index, ch);
        System.out.println("modified String = " + sb); 
		
	}

}	
		
		
//String str="Geeks Gor Geeks";
//int index=6;
//char ch='F';
//System.out.println("Original String = " + str); 
//StringBuilder sb=new StringBuilder(str);
//sb.setCharAt(index, ch);
//System.out.println("modified String = " + sb); 
//		
		
		
//		String str="Geeks Gor Greeks";
//		int index=6;
//		char ch='F';
//		System.out.println("original string "+str);
//		
//		str=str.substring(0,index) + ch + str.substring(index + 1);
//		System.out.println("modified string "+str);

	


