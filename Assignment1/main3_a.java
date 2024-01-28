import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        int x = 10;
        for ( int i = 0; i <= 10; i++){
            System.out.print("*");
            if (i == x){
                System.out.print("\n");
                i=0;
                x--;
            }else if(x == 2 ) {
                break;
            }
        }
    }
}