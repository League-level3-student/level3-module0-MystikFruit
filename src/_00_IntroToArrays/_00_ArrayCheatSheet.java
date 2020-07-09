package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		//1. make an array of 5 Strings
		String[] colors = {"red", "blue", "yellow", "green", "pink"};
		//2. print the third element in the array
		System.out.println(colors[2]);
		//3. set the third element to a different value
		colors[2] = "orange";
		//4. print the third element again
		System.out.println(colors[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
		//7. make an array of 50 integers
		int[] moreIntegers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < moreIntegers.length; i++) {
			moreIntegers[i]=new Random().nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		for (int i = 0; i < moreIntegers.length; i++) {
			if(i==0) {
			num = moreIntegers[i];	
			} else if(moreIntegers[i]<num) {
			num = moreIntegers[i];
			}
		}
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < moreIntegers.length; i++) {
			System.out.println(moreIntegers[i]);
		}
		//11. print the largest number in the array.
		for (int i = 0; i < moreIntegers.length; i++) {
			if(i==0) {
			num2 = moreIntegers[i];	
			} else if(moreIntegers[i]>num2) {
			num2 = moreIntegers[i];
			}
		}
		System.out.println("greatest " + num2);
		//12. print only the last element in the array
		
	}
}
