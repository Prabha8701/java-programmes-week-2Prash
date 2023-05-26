package homeowork_week_6;

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Uppercase string: ");
        String uppercase=scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t=new Programme_9_ConvertUpperToLowerCase();
        t.converUpperToLowercase(uppercase);
        scanner.close();
    }
    public void converUpperToLowercase(String text){
        System.out.println(" The Lowercase value is =" +text.toLowerCase());
    }
}
