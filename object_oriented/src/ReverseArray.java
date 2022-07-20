import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {1,2,3,4,5};
		reverse(array1);
		System.out.println(Arrays.toString(array1));
	}
	
	public static void reverse(int[] array) {
		int left = 0;
		int right = array.length - 1;
		
		while(left <= right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left += 1;
			right -= 1;
		}
	}

}
