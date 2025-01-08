
public class nestedIfElse {
    public static void main(String[] args) {
        int number = -24;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is a positive even number.");
            } else {
                System.out.println(number + " is a positive odd number.");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is a negative even number.");
            } else {
                System.out.println(number + " is a negative odd number.");
            }
        } else {
            System.out.println("The number is zero.");
        }
    }
}
