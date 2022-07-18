package bridgelabz;

import java.util.Scanner;

public class Prime_extend {
	public static void main(String[] args) {
		int i,count;
		System.out.println("Enter the n value");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Prime numbers between 1 to "+n+"are");
		for(int j=2; j<=n; j++) {
			count=0;
			for(i=1; i<=j; i++) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(j+ " ");
			}
		}
		int t=n;
	    int s=palindromeOrNot(n);
	    if(s==t) {
		System.out.println(t+" is a palindrome number ");
	    } else
		System.out.println(t+" is not a palindrome number ");
	}
	static int  palindromeOrNot(int num )
	{
	    int sum=0,r;
	    while(num!=0)
	    {
	    r=num%10;
	    sum=(sum*10)+r;
	    num/=10;	
	    }
	return sum;
	}
}