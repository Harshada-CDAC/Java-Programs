
public class get_character {

	public static void main(String[] args) {
	String str="Harshada";
	int index=3;
	char ch=getCharFromString(str,index);
	System.out.println("str "+str);
	System.out.println("ch "+ch);


}

	private static char getCharFromString(String str, int index) {
		// TODO Auto-generated method stub
		return str.toCharArray()[index];
	}
}
