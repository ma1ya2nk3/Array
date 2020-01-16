
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {88,66,55,44,22};
	  //  System.out.println(bubble(arr));
		bubble(arr);
		display(arr);
		
		
		
		
	} 
	public static void bubble(int[] arr) {
		for(int i= 0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
		
	}
	public static void display(int[] arr) {
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
