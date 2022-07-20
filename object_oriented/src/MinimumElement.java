import java.util.Scanner;

public class MinimumElement {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The minimum integer is: " + findMin(readIntegers(5)));
	}
	
	public static int[] readIntegers(int count) {
		int[] array = new int[count];
		int i = 0;
		while(i < count) {
			int intEntered = scanner.nextInt();
			array[i] = intEntered;
			i ++;
		}	
		return array;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
}
