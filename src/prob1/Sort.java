package prob1;

import java.util.Arrays;

public class Sort {

	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		for(int i = 0; i < array.length - 1; i ++) {
			for(int j = 1; j < array.length; j ++) {
				if(array[j - 1] < array[j]) {
					swap(array, j - 1, j);
				}
			}
			
//			System.out.println(Arrays.toString(array));
		}
		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}