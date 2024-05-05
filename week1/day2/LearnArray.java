package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		int[] age= {18,27,35,46,27,39};
		
		//size of the array
		int size = age.length;
		System.out.println("Length of the array is: "+ size);
		
		//find index 0
		System.out.println("Index of 0: "+age[0]);
		//find the last index
		System.out.println("Last index value: "+age[size-1]);
		
		//to sort array
		Arrays.sort(age);
		System.out.println("Sorted array values: ");
		for(int i=0; i<size; i++) {
			System.out.println(age[i]);
		}
		

	}

}
