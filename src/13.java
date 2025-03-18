import java.util.*; 
class Random{
    public static void main(String[] args){
      // Generate a random number between 1 and 10 (inclusive)
      int randomNumber = (int)(Math.random()*10)+1;
      System.out.println("Random Number: "+randomNumber);
    }
}