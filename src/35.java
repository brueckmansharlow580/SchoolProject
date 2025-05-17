public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Example 1: Generate random numbers and strings
        System.out.println("Random number: " + (int)(Math.random() * 100)); // Generate a random integer between 0 and 99
        
        System.out.println("Random string: " + java.util.Random.getInstanceator().nextString()); // Generate a random string
        
        // Example 2: Generate random arrays
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100); // Randomly generate an integer between 0 and 99
        }
        System.out.println("Random array: " + Arrays.toString(array));
        
        // Example 3: Generate random objects from a class
        class MyClass {
            int age;
            
            public MyClass(int age) {
                this.age = age;
            }
        }
        
        MyClass myObject = new MyClass(20);
        System.out.println("Random object (MyClass): " + myObject);
    }
}
