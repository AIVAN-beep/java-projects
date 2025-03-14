import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 23;
        
        while(true) {
        	System.out.print("What number am I thingking of?: ");
        	int choice = scan.nextInt();
        	
        	if(choice == 23) {
        		System.out.println("Correct!");
        	
        	}else {
        		System.out.println("Wrong!");
        	}
        	
        	System.out.print("Try Again?(y/n): ");
        	char ch = scan.next().charAt(0);
        	
        	if (ch == 'n' || ch == 'N') {
        		System.out.println("Goddbye! Thanks for Playing!");
        		break;
        	}
        	
        	
        }

    }
}
