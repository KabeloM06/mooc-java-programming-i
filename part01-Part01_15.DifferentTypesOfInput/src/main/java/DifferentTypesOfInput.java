
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String strValue = scan.nextLine();
        
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double floatValue = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boolValue = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + strValue);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + floatValue);
        System.out.println("You gave the boolean " + boolValue);
    }
}
