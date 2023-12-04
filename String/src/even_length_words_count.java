
public class even_length_words_count {
	public static void main(String[] args) {
		String str="Hell World Myanme";
		for(String s : str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}
		
	}

}
