public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5 ,b = 7;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}
