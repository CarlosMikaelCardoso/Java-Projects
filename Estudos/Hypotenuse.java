package Estudos;
import java.util.Scanner;

public class Hypotenuse{
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("The Value of x ?");
        x = scanner.nextDouble();
        System.out.println("The Value of y ?");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.print("The Hypotenuse is: "+z);
        scanner.close();
    }
}