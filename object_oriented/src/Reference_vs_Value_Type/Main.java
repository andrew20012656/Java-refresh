package Reference_vs_Value_Type;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 10;
		
		value2 ++;
		
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
		
		anotherArray[0] = 1;
		
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
		
		anotherArray = new int[] {4,5,6,7,8};
		modifyArray(myIntArray);
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
	}
	
	public static void modifyArray(int[] array) {

		array[0] = 2;
		array = new int[] {1,2,3,4,5};
	}
}
