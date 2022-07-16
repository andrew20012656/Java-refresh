
public class Float_and_Double {

	public static void main(String[] args) {
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("minFloat: " + minFloat);
		System.out.println("maxFloat: " + maxFloat);
		
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("minDouble: " + minDouble);
		System.out.println("maxDouble: " + maxDouble);
		
		int myIntValue = 5/3;
		float myFloatValue = 5f/3f;
		double myDoubleValue = 5.00 /3.00;
		
		System.out.println("myIntValue: " + myIntValue);
		System.out.println("myFloatValue: " + myFloatValue);
		System.out.println("myDoubleValue: " + myDoubleValue);
		
		double pound = 130;
		double kilogram = pound*0.45359237;
		System.out.println(kilogram);
		
	}

}
