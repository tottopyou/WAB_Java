import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int b_100 = 0,b_50 = 0,b_20 = 0,b_10 = 0,number;
        Scanner input = new Scanner(System.in);
        System.out.println(" Write the number");
        number = input.nextInt();
        while (true) {
            if (number > 100)
            {
                b_100++;
                number -= 100;
                continue;
            }else if (number > 50){
                b_50++;
                number -= 50;
                continue;
            }else if (number > 20){
                b_20++;
                number -= 20;
                continue;
            }else if (number > 10){
                b_10++;
                number -= 10;
            }else {
                break;
            }


        }
        System.out.println("Result:\n" + "hundred : " + b_100 + "\nfifty :" + b_50 + "\ntwenty :" + b_20 + "\nten :" + b_10 + "\nin coin:" + number);
        }
    }