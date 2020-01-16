
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {54,75,88,21,56,32,45,12};
		insertion(arr);
		display(arr);
		
		// TODO Auto-generated method stub

	}
	public static void insertion(int[] arr) {
		for(int i= 0;i<=arr.length-1;i++) {
			int val = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>val) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
	}
	public static void display(int[] arr) {
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
