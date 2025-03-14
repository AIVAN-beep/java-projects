import java.time.LocalDate;

public class BasicSyntax {
    public static void main(String[] args) {
        float width = 8;
        float length = 10;
        
        System.out.println("Retangle width: " +width+ "cm");
        System.out.println("Retangle length: " +length+ "cm");
        
        float result = length * width;
        System.out.println("The calculated area of a rectangle is: " + result + "cm");
    }
}