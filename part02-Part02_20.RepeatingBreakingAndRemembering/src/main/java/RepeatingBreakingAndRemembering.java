
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        //int value = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        
        while (true){
            int value = Integer.valueOf(scanner.nextLine());
            // check if loop should end
            if (value == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            
            // Check for even numbers
            if (value % 2 == 0){
                even++;
            } else {
                // inciment odd
                odd++;
            }
            
            // Add unputed numbers
            sum += value;
            counter++;
            
        } 
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + 1.0*sum/counter);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
