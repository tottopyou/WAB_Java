import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        int x = 5, y = 5;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i <= 5) {
                    if (j <= x || j >= y) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (j <= x || j >= y) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }
            }
            System.out.print("\n");
            if (i == 5){
                continue;
            }else if (i <= 5) {
                y++;
                x--;
            }else {
                y--;
                x++;
            }
        }
    }
}