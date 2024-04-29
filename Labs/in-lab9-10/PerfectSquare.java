import java.util.Scanner;
import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n = 1;
        System.out.println("Enter the m number:");
        m = input.nextInt();

        double[] array = sf_m(m);

        Set<Double> uniqueFactors = new HashSet<>();
        Set<Double> repeatedFactors = new HashSet<>();

        for (double factor : array) {
            if (factor != 0) {
                if (!uniqueFactors.contains(factor)) {
                    uniqueFactors.add(factor);
                } else {
                    repeatedFactors.add(factor);
                }
            }
        }

        uniqueFactors.removeAll(repeatedFactors);

        for (double num : uniqueFactors) {
            if (num != 0) {
                n*= num;
            }
        }
        System.out.print("N is equal: " + n);
    }
    public static double[] sf_m(int m) {
        double[] ar = new double[20];
        int j = 0;

        for (int i = 2; i <= m; i++) {
            while (m % i == 0) {
                ar[j] = i;
                j++;
                m /= i;
            }
        }
        return ar;
    }
}
