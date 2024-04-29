import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        String sentence = "I will never spam my friends again.";
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
        for ( int i = 1; i<=100; i++)
        {
            StringBuilder modifiedSentence = new StringBuilder(sentence);
            for ( int j = 0; j<=8; j++) {
                int index = rand.nextInt(sentence.length());
                char randomChar = AlphaNumericString.charAt(rand.nextInt(AlphaNumericString.length()));
                modifiedSentence.setCharAt(index, randomChar);
            }
            System.out.println(i + ":" + modifiedSentence);
        }
    }
}