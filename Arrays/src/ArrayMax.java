
public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {30,50,70,40,60};
		int max = Integer.MIN_VALUE;
		for(int i= 0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		

	}
	

}
