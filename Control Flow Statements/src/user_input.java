import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your name: ");
		String name = scanner.nextLine();	
		System.out.println("Please input your year of Birth: ");
		int age = 2022 - scanner.nextInt();
		System.out.println("Your name is : " + name);
		System.out.println("Your age is : " + age);
		scanner.close();
	}

}
