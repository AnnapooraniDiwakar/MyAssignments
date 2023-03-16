package week3assignment;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] company= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int length = company.length;
		System.out.println("The length of the string is "+length);
		Arrays.sort(company);
	for(int i=length-1;i>=0;i--)
	{
		System.out.print(company[i]+" ");
	}
	}

}
