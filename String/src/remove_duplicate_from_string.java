import java.util.HashSet;
import java.util.Set;

public class remove_duplicate_from_string {

	public static void main(String[] args) {
		String str="harshada";
		System.out.println(remove(str));

	}
    public static String remove(String str)
    {
    	HashSet<Character> set=new HashSet<>();
    	StringBuffer sf=new StringBuffer();
    	for(int i=0;i<str.length();i++) {
    		Character c=str.charAt(i);
    	if(!set.contains(c))
    	{
    		set.add(c);
    		sf.append(c);
    	}
    	}
    	
		return sf.toString();
    }
}	
    


