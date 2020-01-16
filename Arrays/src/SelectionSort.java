
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {54,89,621,35,47,2};
		selection(arr);
		display(arr);

	}
	public static void selection(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j =i+1;j<=arr.length-1;j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void display(int[] arr) {
		for(int a:arr) {
			System.out.println(a);
		}
		
	}

}
