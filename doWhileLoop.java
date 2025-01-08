public class doWhileLoop {
    public static void main(String[] args) {
        int number = 10; 

        do {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } while (false); 
    }
}
