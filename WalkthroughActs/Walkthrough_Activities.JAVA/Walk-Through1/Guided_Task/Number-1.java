import java.time.LocalDate;

public class BasicSyntax {
    public static void main(String[] args) {
        String name = "Aivan";

        String message = "An Astonishing Morning dear ";
        System.out.println(message + name);

        // Date and Time
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's Date: " + currentDate);
    }
}