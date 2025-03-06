import java.util.Random;
public class SchoolProject {
	public static void main(String[] args) {
		// Code to generate a random number between 1 and 10
		Random rand = new Random();
		int num = rand.nextInt(10 - 1 + 1) + 1;
		System.out.println("Your random number is: " + num);
	}
}
