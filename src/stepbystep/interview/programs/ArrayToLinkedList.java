package stepbystep.interview.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ArrayToLinkedList {

	private int lengthCounter = 1;
	private int loopCounter = 0;
	
	LinkedList<Integer> list = new LinkedList<Integer>();

	public Integer computeLength(int[] numArr) {

		if (numArr.length == 0) {
			return 0;
		} else if (numArr.length == 1) {
			return 1;
		}
	
		do {
			list.add(numArr[loopCounter]);			
			lengthCounter++;
			loopCounter = numArr[loopCounter];
		}
		while (numArr[loopCounter] != -1);
		
		if(numArr[loopCounter] == -1)
		{
			list.add(numArr[loopCounter]);
		}
		
		System.out.println("Formed Linked List -> "+list);
		return lengthCounter;
	}

	public static void main(String args[]) throws IOException {
		System.out.println("Enter the number list seperated by comma.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr[] = (br.readLine()).split(",");

		int numArr[] = new int[numStr.length];

		for (int i = 0; i < numStr.length; i++) {
			numArr[i] = Integer.parseInt(numStr[i]);
		}
		br.close();

		ArrayToLinkedList obj = new ArrayToLinkedList();
		System.out.println("The length of LinkedList is -> " + obj.computeLength(numArr));
	}
}
