
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the username and password
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        // Check for alex
        if(username.equals("alex") && password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if (username.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
