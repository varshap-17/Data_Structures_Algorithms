package bridgelabz;

import java.util.Scanner;

public class BinarySearch {
	
	public static void binarysearch(int arr[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
			}
			else if(arr[mid]==key) {
				System.out.println("Element is found at index:"+mid);
				break;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println("The elements are 10,20,30,40,50");
		int last=arr.length-1;
		int first=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key value:");
		int key=sc.nextInt();
		binarysearch(arr,first,last,key);
		}
}
