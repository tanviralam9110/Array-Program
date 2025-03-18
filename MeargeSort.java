package shorting_array;

public class MeargeSort {
	public static void main(String[] args) {
		int []a= {45,66,8,548,55,245,545,65,545,56};
		divide(a, 0, a.length-1);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	
	public static void divide(int[] a,int start, int end) {
		if(start<end) {
			int mid=start+(end-start)/2;
			divide(a,start,mid);
			divide(a, mid+1, end);
			merge(a, start, mid, end);
		}
	}
	public static void merge(int[]a,int start, int mid,int end) {
		int[] mearged=new int[end-start+1];
		int index1=start, index2=mid+1, x=0;
		
		while(index1<=mid && index2<=end) {
			if(a[index1]<a[index2])
				mearged[x++]=a[index1++];
			else
				mearged[x++]=a[index2++];
		}
		while(index1<=mid)
			mearged[x++]=a[index1++];
		while(index2<=end)
			mearged[x++]=a[index2++];
		for(int i=0,j=start;i<mearged.length;i++,j++) {
			a[j]=mearged[i];
		}
	}

}
