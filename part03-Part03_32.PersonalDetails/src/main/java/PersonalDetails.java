
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        int years = 0;
        int counter = 0;
        
        while (true){
            //read input
            String input = scanner.nextLine();
            // break if empty string
            if (input.equals("")){
                break;
            }
            
            //split input into string array
            String[] parts = input.split(",");
            years += Integer.valueOf(parts[1]);
            counter++;
            
            // check if oldest
            if (longest.length() < parts[0].length()){
               
                longest = parts[0];
                
            }
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Agerage of the birth years: " + (1.0*years/counter));
    }
}
