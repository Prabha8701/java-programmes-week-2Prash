package homeowork_week_6;

import java.util.Scanner;

/**
        * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
        */

public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius= scanner.nextDouble();
        areaOfCircle(radius);
        scanner.close();

    }
    //calculating area of circle
    public static void areaOfCircle(double radius){
        double pi= Math.PI;
        double area= (pi* radius * radius);
        System.out.println(" the area of Circle :"+area);

    }

}
