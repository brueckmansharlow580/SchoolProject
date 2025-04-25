public class SchoolProject {
    public static void main(String[] args) {
        // Example of student data in Java
        Student student1 = new Student("John", "Smith");
        Student student2 = new Student("Alice", "Brown");

        System.out.println("Student 1: " + student1.getName() + " - " + student1.getAge());
        System.out.println("Student 2: " + student2.getName() + " - " + student2.getAge());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }
}
