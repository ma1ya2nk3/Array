
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,25,29,30,37,48,58};
		int item = 37;
		System.out.println(binary(arr,item));
		

	}
	public static int binary(int[] arr,int item) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo + hi)/2;
			if(arr[mid]<item) {
				lo = mid+1;
			}else if(arr[mid]>item) {
				hi = mid-1;
			}else {
				return mid;
			}
			
		}
		return -1;
			
		
	}

}
