package week3assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="babloo";
		char[] charArray = text.toCharArray();
			Set<Character> se=new HashSet<Character>();
			for(Character ch:charArray)
			if(!se.add(ch))
			{
				se.remove(ch);
			}
			 for (Character Char : se) 
			 {
		         System.out.print(Char + " ");
			}
	}

}
