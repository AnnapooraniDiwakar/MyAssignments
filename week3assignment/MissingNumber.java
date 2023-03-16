package week3assignment;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7};
		Set<Integer>set=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
	set.add(data[i]);
		}
		int mis=set.iterator().next();
	for(Integer num:set)
	{
		if(num!=mis)
		{
			System.out.println(mis);
			break;
		}
		mis++;
		}
	}

}
