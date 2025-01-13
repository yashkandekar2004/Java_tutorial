public class eve {
    int num = 3;

    public void checkEvenOdd() {
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void main(String[] args) {
        eve eo = new eve();
        eo.checkEvenOdd();
    }
}
