import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        double sum = 10000,tuition = 10000,sum10=0;
        for (int i = 0 ; i<=14;i++){
            tuition += tuition * 0.05;
            sum += tuition;
            if (i == 10 ) {
                sum10 = sum;
            }
        }
        System.out.println("Tuition for 10 year : " + sum10 + "Total tuition for 4 year after 10 year " + (sum - sum10));
    }
}