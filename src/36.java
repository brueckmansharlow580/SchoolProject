import java.util.Scanner;

public class SimpleSchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the school.");
        
        int age;
        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age < 18) {
                System.out.println("You are not old enough to enter the school.");
            } else {
                break;
            }
        } while (true);
    }
}
