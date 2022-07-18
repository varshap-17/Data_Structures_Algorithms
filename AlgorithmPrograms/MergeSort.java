package bridgelabz;

public class MergeSort {
	void merge(int a[],int beg,int mid,int end) {
		int i,j,k;
		int n1=mid-beg+1;
		int n2=end-mid;
		int leftarray[]=new int[n1];
		int rightarray[]=new int[n2];
		for(i=0;i<n1;i++) {
			leftarray[i]=a[beg+i];
		}
		for(j=0;j<n2;j++) {
			rightarray[j]=a[mid+1+j];
		}
		i=0;
		j=0;
		k=beg;
		while(i<n1 && j<n2) {
			if(leftarray[i]<=rightarray[j]) {
				a[k]=leftarray[i];
				i++;
			}else {
				a[k]=rightarray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=rightarray[j];
			j++;
			k++;
		}
	}
	void mergesort(int a[],int beg,int end) {
		if(beg<end) {
			int mid=(beg+end)/2;
			mergesort(a,beg,mid);
			mergesort(a,mid+1,end);
			merge(a,beg,mid,end);
		}
	}
	void print(int a[],int n) {
		int i;
		for(i=0;i<n;i++) {
			System.out.println(a[i]+ "");
		}
	}
	public static void main(String[] args) {
		int a[]= {11,30,24,7,31,16,39,41};
		int n=a.length;
		MergeSort m1=new MergeSort();
		System.out.println("Before sorting array elements");
		m1.print(a, n);
		m1.mergesort(a, 0, n-1);
		System.out.println("\nafter sorting an array elements");
		m1.print(a, n);
		System.out.println("");
	}
}
