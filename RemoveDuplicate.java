package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String a="PayPal India";
		 char[] ch = a.toCharArray();
			 Set<Character>charSet=new LinkedHashSet<Character>();
			 Set<Character>dupCharSet=new LinkedHashSet<Character>();

for(int i=0;i<ch.length;i++)
{
			 if(charSet.add(ch[i]))
				 {
					 
				 }
			 else
			 {
				 dupCharSet.add(ch[i]);
			 }
		 }
for(Character character:dupCharSet) {
	if(charSet.contains(character))
	{
		charSet.remove(character);
	}
	
}
for(Character character:charSet) 
{
if(character==' ')	
{
	
}
else
{
	System.out.println(character);
}
}
			 
	}}

