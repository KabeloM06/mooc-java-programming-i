
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            
            // Test if the while loop should continue
            if (number == 0){
                break;
            }
            // Look for positive numbers
            if (number > 0){
                counter++;
                sum += number;
            }
        }
        
        //Check if there have been positives
        if (counter > 0){
            // Print average
            System.out.println(1.0*sum/counter);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
