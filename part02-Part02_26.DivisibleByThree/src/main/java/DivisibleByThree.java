
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(3, 6);
    }
    
    // method to check if divisible by 3
    public static void divisibleByThreeInRange(int beginning, int end){
        int counter = beginning;
        
        while(true){
            if(counter > end){
                break;
            }
            if(counter % 3 == 0){
                System.out.println(counter);
                
            }
            counter++;
        }
    }

}
