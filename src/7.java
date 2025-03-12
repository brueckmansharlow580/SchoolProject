  package SchoolProject;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random random = new Random();
        int number = random.nextInt(10);
        if (number > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is less than or equal to 5");
        }
    }
}