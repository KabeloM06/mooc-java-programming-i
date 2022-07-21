
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("Which index should we access first? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Which index should we access second? ");
        int second = Integer.valueOf(scanner.nextLine());
        
        // swapping the inices
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;

        // Printing the new array
        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
