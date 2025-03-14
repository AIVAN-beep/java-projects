import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        
        do {
        	System.out.print("Enter Anything ('exit' to quit): ");
        	input = scan.nextLine();
        	System.out.println("You Entered: " + input);
        	
        	
        }while(!input.equalsIgnoreCase("exit"));
        
        System.out.println("Goodbye!");
        scan.close();

    }
}
