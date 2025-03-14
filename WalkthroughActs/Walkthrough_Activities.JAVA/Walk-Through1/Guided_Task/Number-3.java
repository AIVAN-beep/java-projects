import java.time.LocalDate;
import java.time.LocalTime;

public class BasicSyntax {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        LocalDate currentDate = LocalDate.now();
        System.out.println("Today is: " + currentDate);
    }
}
