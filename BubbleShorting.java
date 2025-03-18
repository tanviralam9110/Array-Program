package shorting_array;

public class BubbleShorting {
	
	public static void main(String[] args) {
		int [] a= {12,5,4,85,24,65,45,65};
		bubbleShortin(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	
	public static void bubbleShortin(int[]a) {
		//bubble short shorting on large number
		//length of index -1
		for(int i=0; i<a.length-1;i++) {
			int count=0;
			//Inner loop start -1 and also -i
			for(int j=0; j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
				}
			}
			if(count==0)
				return;
		}
	}

}
