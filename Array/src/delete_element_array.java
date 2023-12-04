import java.lang.reflect.Array;
import java.util.Arrays;

public class delete_element_array {
	

	public static void main(String[] args) {
		int oa[]= {1,2,3,4,5};
		int er=1;
		int []na=remove(oa,er);
		System.out.print(Arrays.toString(oa));
		System.out.print(Arrays.toString(na));
	}
	
	public static int[] remove(int a[],int e)
	{
		int na[]=new int[a.length-1];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=e)
			{
				na[index]=a[i];
				index++;
			}
		}
		return na;
		
	}

}
