package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class PrintDuplicateArray {
	public static void main(String[] args) {
		int[] arr = {10,14,17,12,10,14,11,16,17,10,16,11,28};
		int i=0;
		List<Integer>list=new ArrayList<Integer>();
		list.add(arr[i]);
		Set<Integer> set1 = new TreeSet<Integer>();
	    Set<Integer> set2= new TreeSet<Integer>();
	    for(Integer inte:arr)
	    	if(!set1.add(inte))
	    	{
	    		set2.add(inte);
                    
                    }
	    System.out.println("Duplicate integers in given list is/are " + set2);            
	}
}


