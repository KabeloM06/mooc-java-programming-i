

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int number){
        
        int counter = number;
        
        while(true){
            if(counter == 0){
                break;
            }
            System.out.println(counter);
            counter--;
        }
    }

}
