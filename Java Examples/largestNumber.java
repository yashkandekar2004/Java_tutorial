public class largestNumber {
    int num1 = 5, num2 = 7, num3 = 9;

        public void checkLargestNumber() {
            if (num1 >= num2 && num1 >= num3)
                System.out.println(num1 + " is the largest number.");
            else if (num2 >= num1 && num2 >= num3)
                System.out.println(num2 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        }
    
    public static void main(String[] args) {
        largestNumber ln = new largestNumber();
        ln.checkLargestNumber();
    }
}