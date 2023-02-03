package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
  public static void main() {
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
      "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
      "pepper", "pineapple", "pumpkin", "potato"};
    playGuessTheWord(words);
  }

  private static void playGuessTheWord(String[] words) {
    System.out.printf("Отгадайте слово из данного списка:\n%s\n", Arrays.toString(words));
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
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
