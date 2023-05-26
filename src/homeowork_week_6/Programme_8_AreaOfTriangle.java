package homeowork_week_6;

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter length of the Triangle: ");
        int length= scanner.nextInt();
        System.out.println(" Please enter Height of the triangle: ");
        int height=scanner.nextInt();
        areaOfTriangle(height, length);
        scanner.close();
    }
    public static void areaOfTriangle(int length, int height){
        int area=(length*height)/2;
        System.out.println("The area of a triangle is : " +area);
    }


}
