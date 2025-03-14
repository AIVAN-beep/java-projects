import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Enter A number: ");
			int num = scanner.nextInt();
			if (num % 2 == 0) {
			System.out.println("Number " + num +" is Even.");
			} else {
			System.out.println("Number " + num + " is Odd.");
			}
			
			System.out.print("Do you want Enter Another Number?(y/n): ");
			char choice = scanner.next().charAt(0);
			
			if (choice == 'n' || choice == 'N') {
			    System.out.println("Goodbye!");
			    break;
			}
			
		}

	}

}
