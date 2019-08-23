package CayP3_16SortStringLexicographically;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordArray = new String[3];
        System.out.println("Enter three strings: ");
        String words = scanner.nextLine();
        int index = 0;
        for (String word : words.split(" ")) {
            wordArray[index] = word;
            index++;
        }


        Arrays.sort(wordArray);

        for (int wordIndex = 0; wordIndex < wordArray.length; wordIndex++) {
            System.out.println(wordArray[wordIndex]);
        }


    }
}
