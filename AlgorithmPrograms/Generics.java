package bridgelabz;

import java.util.Arrays;

public class Generics {
	public static void main(String[] args) {
		int array[]= {10,8,6,3,5,7,1,0,2};
		Arrays.sort(array);
		System.out.println("Sorted Array:");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}
		int index=Arrays.binarySearch(array, 7);
		if(index>=0) {
			System.out.println("Element found at index position:" +index);
		}else
			System.out.println("Element not found");
	}
}
