import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MaxOnes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter size of matrix:");
        n = input.nextInt();
        int[][] matrix = new int[n][n];


        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxR = 0;
        int maxC = 0;
        ArrayList<Integer> maxOnesRows = new ArrayList<>();
        ArrayList<Integer> maxOnesCols = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int countR = 0;
            int countC = 0;
            for (int j = 0; j < n; j++) {
                countR += matrix[i][j];
                countC += matrix[j][i];
            }
            if (countR > maxR) {
                maxR = countR;
                maxOnesRows.clear();
                maxOnesRows.add(i+1);
            } else if (countR == maxR) {
                maxOnesRows.add(i+1);
            }
            if (countC > maxC) {
                maxC = countC;
                maxOnesCols.clear();
                maxOnesCols.add(i+1);
            } else if (countC == maxC) {
                maxOnesCols.add(i+1);
            }
        }

        System.out.println("Rows with the most 1s: " + maxOnesRows + " Count: " + maxR);
        System.out.println("Columns with the most 1s: " + maxOnesCols + " Count: " + maxC);
    }
}