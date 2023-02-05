package ru.geekbrains.lesson3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Играем в первую игру:");
    GuessTheNumber.playGuessTheNumber(scanner);
    System.out.println("__________________________\nИграем во вторую игру:");
    GuessTheWord.playGuessTheWord(scanner);
    scanner.close();
  }
}
