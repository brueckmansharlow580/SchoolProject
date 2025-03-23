public class SimpleJavaProject {
    public static void main(String[] args) {
        // Example of basic Java code
        System.out.println("Hello, World!");
        
        int age = 20;
        boolean isStudent = true;

        // Output the results to console
        System.out.println("Age: " + age);
        System.out.println("Is student: " + isStudent);

        if (age > 18 && !isStudent) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a teenager.");
        }
    }
}
