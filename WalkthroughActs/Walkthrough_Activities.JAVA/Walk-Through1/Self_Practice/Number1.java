package walkthrough1;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Enter Your Name: ");
        name = scan.nextLine();
        System.out.println("Your Name is: "+name);
        
        System.out.print("Enter Your Age: ");
        age = scan.nextInt();
        System.out.println("Your Age is: "+age);
        
    }
}
