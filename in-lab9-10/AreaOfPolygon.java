import java.util.Scanner;

public class AreaOfPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double[] x_Coord;
        double[] y_Coord;

        System.out.println("Enter the count of corners :");
        n = input.nextInt();

        x_Coord = new double[n];
        y_Coord = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter x coordinate of corner " + (i+1) + ":");
            x_Coord[i] = input.nextDouble();
            System.out.println("Enter y coordinate of corner " + (i+1) + ":");
            y_Coord[i] = input.nextDouble();
        }

        double area = calculateArea(x_Coord, y_Coord);
        System.out.println("Area of the polygon: " + area);
    }

    public static double calculateArea(double[] x, double[] y) {
        int n = x.length;
        double area = 0;

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += x[i] * y[j];
            area -= y[i] * x[j];
        }

        area = Math.abs(area / 2.0);
        return area;
    }
}