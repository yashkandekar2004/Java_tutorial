import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        }
    }
}
