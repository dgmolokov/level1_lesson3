package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {

  public static void playGuessTheWord(Scanner scanner) {
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
      "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
      "pepper", "pineapple", "pumpkin", "potato"};
    System.out.printf("Отгадайте слово из данного списка:\n%s\n", Arrays.toString(words));
    var random = new Random();
    String hiddenWord = words[random.nextInt(words.length)];
    System.out.println(hiddenWord);
    while (true) {
      String answer = scanner.nextLine();
      if (answer.equals(hiddenWord)) {
        System.out.println("Вы угадали!");
        break;
      } else {
        String result = "###############";
        for (int i = 0; i < answer.length() && i < hiddenWord.length(); i++) {
          if (answer.charAt(i) == hiddenWord.charAt(i)) {
            result = result.substring(0, i) + answer.charAt(i) + result.substring(i + 1);
          }
        }
        System.out.println(result);
      }
    }
  }
}
