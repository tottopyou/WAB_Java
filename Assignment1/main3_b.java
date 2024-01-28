import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        int x = 10;
        for ( int i = 0; i <= 10; i++) {
            for ( int j = 0; j <= 10; j++){
                if ( j < x ){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
            x--;
        }
    }
}