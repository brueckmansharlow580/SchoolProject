import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the subject you want to learn today: ");
        String subject = scanner.nextLine();

        System.out.println("Hello, " + name + ", today you are going to learn about " + subject);
    }
}
