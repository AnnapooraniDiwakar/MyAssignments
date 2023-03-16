package week3assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PayPal India";
		char[] charArray = str.toLowerCase().toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        Set<Character> dupCharSet = new HashSet<Character>();
        for (Character c : charArray)
        {
            if (!charSet.add(c)) 
            {
                dupCharSet.add(c);
      System.out.println(dupCharSet);
            }
        }
        
        charSet.removeAll(dupCharSet);
        for (Character c : charSet) 
        {
            if (c!=' ') 
            {
                System.out.print(c);
            }
        }
	}

}
