// public class SumNumbers {
//     public static void main(String[] args) {
//         int n = 5; 
//         int sum = 0;
//         int i = 1;

//         while (i <= n) {
//             sum += i; 
//             i++;
//         }

//         System.out.println("Sum of first " + n + " numbers is: " + sum);
//     }
// }
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableOf = 5; 
        int i = 1;

        while (i <= 10) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
            i++;
        }
    }
}