import java.util.Scanner;

public class ArrayOperation {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = takeInput();
		display(array);
		System.out.println(array.length);
		

	}
	public static int[] takeInput() {
		System.out.println("Size");
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i = 0;i<arr.length;i++) {
			System.out.println("enter value");
			arr[i]= sc.nextInt();
		}
		return arr;
		
	}
	public static void display(int[] arr) {
		for(int x :arr) {
			System.out.println(x);
		}
		
	}

}
