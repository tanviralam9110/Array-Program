package shorting_array;

public class InsertionSort {
	public static void main(String[] args) {
		int[]a={45,25,66,88,95,42,14,5,658,45};
		insertionShort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	
	public static void insertionShort(int [] a) {
		for(int i=1; i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
