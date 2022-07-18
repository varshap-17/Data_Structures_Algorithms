package bridgelabz;

public class Permutestring {
	
	public static String swapString(String a,int i, int j) {
		char[] b=a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		return String.valueOf(b);
	}
	public static void generatePermutation(String str,int start,int end) {
		if(start==end-1) {
			System.out.println(str);
		}else {
			for(int i=start; i<end; i++) {
				str=swapString(str,start,i); //swapping the string
				generatePermutation(str,start+1,end); //recursive the calling function for characters
				str=swapString(str,start,i); //backtracking and swapping the characters again
			}
		}
	}
	public static void main(String[] args) {
		String str="TRAIN";
		int len=str.length();
		System.out.println("All permutations of the strings are:");
		generatePermutation(str,0,len);
	}
}
