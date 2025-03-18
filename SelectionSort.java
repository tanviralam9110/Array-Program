package shorting_array;

public class SelectionSort {
	public static void main(String[] args) {
		int []a= {78,49,47,48,62,48,50};
		selectionSort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	
	public static void selectionSort(int[] a) {
		for(int i=0; i<a.length-1;i++) {
			int min=a[i];
			int minIndex=i;
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[j]<min) {
					min=a[j];
					minIndex=j;
				}
			}
			a[minIndex]=a[i];
			 a[i]=min;
		}
	}

}
