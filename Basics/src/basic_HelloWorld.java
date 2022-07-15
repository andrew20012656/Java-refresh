
public class basic_HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int firstNum = 1;
		
		int smallestNum = Integer.MIN_VALUE;
		int maxNum = Integer.MAX_VALUE;
		System.out.println("Smallest integer: " + smallestNum);
		System.out.println("Largest integer: " + maxNum);
		
		// Overflow and Underflow
		System.out.println("Overflow: " + (maxNum + 1));
		System.out.println("Underflow: " + (smallestNum - 1));
		
	}

}
