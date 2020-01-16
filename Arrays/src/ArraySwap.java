
public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60,70,80,90};
		int i= 0;
		int j= 1;
		Swap(arr,i,j);
		for(int val:arr) {
			System.out.println(val);
		}
		

	}
	public static void Swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		System.out.println(arr[i]+"  "+arr[j]);
	}

}
