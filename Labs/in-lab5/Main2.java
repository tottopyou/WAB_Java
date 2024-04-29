import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int a,b,GCD = 1;
        Scanner input = new Scanner(System.in);
        System.out.println(" Write the number a and b, both should be positive");
        a = input.nextInt();
        b = input.nextInt();
        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        System.out.println(GCD);
    }
}