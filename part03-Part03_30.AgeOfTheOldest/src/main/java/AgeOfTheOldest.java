
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
       
        
        while (true){
            //read input
            String input = scanner.nextLine();
            // break if empty string
            if (input.equals("")){
                break;
            }
            
            //split input into string array
            String[] parts = input.split(",");
            
            
            // check if oldest
            if (oldest < Integer.valueOf(parts[1])){
                oldest = Integer.valueOf(parts[1]);
                
            }
        }
        
        //print oldest
        System.out.println("Age of the oldest: " + oldest);
    }
}
