package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

  public static void playGuessTheNumber(Scanner scanner) {
    var random = new Random();
    while (true) {
      System.out.println("Угадайте число от 0 до 9");
      int hiddenNumber = random.nextInt(9);
      System.out.println(hiddenNumber);
      for (int i = 0; i < 3; i++) {
        int answer = scanner.nextInt();
        if (hiddenNumber > answer) {
          System.out.println("Загаданное число больше");
        } else if (hiddenNumber < answer) {
          System.out.println("Загаданное число меньше");
        } else {
          System.out.println("Вы победили!");
          break;
        }
      }
      System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
      int restartGame = scanner.nextInt();
      if (restartGame == 0) {
        break;
      }
    }
  }
}
