public class factorial {
    int number = 5;
    int factorial = 1;
    public void checkFactorial() {
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        f.checkFactorial();
    }
}
