import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hey Mr. hóember!");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy sornyi szöveget:");
        String text = scanner.nextLine();
        System.out.println("A 3 vagy annál hosszabb karakterből álló szavak listája: ");
        String[] words = text.split("\\s+");
        String[]getlongwords = new String[words.length];
//        String[] longWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3) {

                System.out.print(words[i] + ", ");
                for (int j = 0; j < getlongwords.length; j++) {
                    getlongwords[j] = words[i];
                }
            }
        }
        for (int j = 0; j < getlongwords.length; j++) {
            System.out.print(getlongwords);
        }



    }
}