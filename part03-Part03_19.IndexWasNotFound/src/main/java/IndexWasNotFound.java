

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        //System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

         //Implement the search functionality here
        int index = 0;
        int found = 0;
        
        while (index < array.length){
            //add conditions
            if (searching == array[index]){
                found++;
                System.out.println(searching + " is at index " + index + ".");
            }
            
            index++;
            
        
        }
        
        //System.out.println("working");
        if (found == 0){
            System.out.println(searching + " was not found.");
        }
        
//        Boolean isPresent = false;
//        
//        for (int i = 0; i < array.length; i++){
//            if (searching == array[i]){
//                isPresent = true;
//                System.out.println(searching + " is at index "+ i + ".");
//            }
//               
//        }
//        // For when number is not present
//        if (isPresent = false){
//            System.out.println(searching + " was not found.");
//        }
    }

}
