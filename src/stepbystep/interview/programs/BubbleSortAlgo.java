/*
Problem Statement for Bubble sort- 
Condition -
1. Accept the number list runtime. User will enter the numbers with a space in between.
2. Sort the number list in ascending order using bubble sort mechanism.
3. Please keep the count of swaps done while doing sorting.
4. Print the swap count, and the sorted number list.
*/

package stepbystep.interview.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSortAlgo {
	
	// To keep the counter of swaps required for sorting the array.
	private static int swapCounter=0;	
	
	public void sortList(int num[])
	{
		for(int i=0; i<num.length; i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]>num[j+1])
				{
					swapCounter++;
					System.out.println("This is Swap No .-"+swapCounter);
					System.out.println("Number List Before Swap - "+Arrays.toString(num));
					System.out.println(num[j]+ " is swapped with "+num[j+1]);
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					System.out.println("Number List Before Swap - "+Arrays.toString(num));
				}
			}
		}
		
		System.out.println("No of Swap Required - "+swapCounter);
		System.out.println("Sorted List - "+Arrays.toString(num));
	}

	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the number list seperated by space.");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String numStr[] = (br.readLine()).split(" ");
		
		int numArr[] = new int[numStr.length];
		
		for(int i=0; i<numStr.length; i++)
		{
			numArr[i]=Integer.parseInt(numStr[i]);
		}
		br.close();
		
		BubbleSortAlgo obj = new BubbleSortAlgo();
		obj.sortList(numArr);		
	}
	
}
