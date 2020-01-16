
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,30,50,35,40};
		int item =35;
		System.out.println(linear(arr,item));
		

	}
	public static int linear(int[] arr,int item) {
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
		
	}

}
