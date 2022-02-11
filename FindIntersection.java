package week3.day2;

import java.util.Set;
import java.util.TreeSet;


public class FindIntersection {
	public static void main(String[] args) {
		int[] arr={5,2,13,4,6,7};
		int[] arr1= {0,2,8,4,5,7};
		Set<Integer>uniqueNumbers=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
		    uniqueNumbers.add(arr[i]);
		}
		Set<Integer>uniqueNumbers2=new TreeSet<Integer>();
		for(int j=0;j<arr.length;j++) {
		    uniqueNumbers2.add(arr1[j]);
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println(arr[i]);
	}}}}}


