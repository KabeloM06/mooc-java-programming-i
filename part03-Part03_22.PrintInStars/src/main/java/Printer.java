
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int index = 0;
        
        while (index < array.length){
            // Access the index
            int stars = array[index];
            
            // print stars
            for (int i = 1; i <= stars; i++){
                System.out.print("*");
            }
            System.out.println();
            
            //ncriment index
            index++;
        }
    }

}
