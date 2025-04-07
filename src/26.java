public class SimpleSchoolProject {
    public static void main(String[] args) {
        // Example of basic operations
        int sum = 0;
        int multiplyByTen = 10;

        System.out.println("The result is: " + (sum * multiplyByTen));

        // Exercise examples
        double averageGrade = calculateAverage(95, 87.6);
        System.out.println("Average grade: " + averageGrade);

        String name = getUserName();
        System.out.println("Username: " + name);
    }

    private static double calculateAverage(int... values) {
        return sum(values) / values.length;
    }

    private static int sum(int... values) {
        int result = 0;

        for (int value : values) {
            result += value;
        }

        return result;
    }
}
