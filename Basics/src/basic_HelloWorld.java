
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
		
		// Different primitive types
		int minInt = Integer.MIN_VALUE;
		int myMaxInt = 2_147_483_647;
		int test1 = 1_23_4;
		System.out.println(test1);
		
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("Min Byte is " + minByte);
		System.out.println("Max Byte is " + maxByte);
		
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("Min Short is " + minShort);
		System.out.println("Max Short is " + maxShort);
		
		long minLong = 100L;
		long maxLong = Long.MAX_VALUE;
		System.out.println("Min Long is " + minLong);
		System.out.println("Max Long is " + maxLong);
		long bigLongLiteral = 2_147_483_647_234L;
		
		short bigShortLiteral = 32767;
		
		int myTotal = minInt / 2;
		// byte myNewByte = (minByte / 2); Creates a problem!!!!!!
		byte myNewByte = (byte)(minByte/2);
		
		// short myNewShort = minShort /2; Creates a problem!!!!!!
		short myNewShort = (short)(minShort/2);
		
		// Practice:
		byte byte1 = 7;
		short short1 = 1222;
		int int1 = 12888888;
		long long1 = 50000L + 10L * (long)(byte1 + short1 + int1);
		short short2 = (short)(1000 + 10*
				(byte1 + short1));
	}

}
