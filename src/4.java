package com.example;

import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    int randomNumber = new Random().nextInt(10);
    System.out.println("Your random number is: " + randomNumber);
  }
}
