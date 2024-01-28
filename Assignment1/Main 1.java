import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int area,perimeter;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int b = rand.nextInt(10,50);
        int h = rand.nextInt(10,50);
        int a = rand.nextInt(10,50);
        area = b * h;
        perimeter = 2*(a+b);
        System.out.println("Result:" + "\nArea: " + area + "\nPerimeter: " + perimeter);
        }
    }