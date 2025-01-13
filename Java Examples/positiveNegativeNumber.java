public class positiveNegativeNumber {
    int number = 0;
    public void checkNumber() {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    public static void main(String[] args) {
        positiveNegativeNumber pn = new positiveNegativeNumber();
        pn.checkNumber();
    }
}
