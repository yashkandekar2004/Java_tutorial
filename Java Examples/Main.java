// public class Polymorphism {
//     public static void main(String[] args) {
//         FibonacciSeries fs = new FibonacciSeries();
//         fs.printFibonacci();

//         EvenOdd eo = new EvenOdd();
//         eo.checkEvenOdd();

//         LargestNumber ln = new LargestNumber();
//         ln.checkLargestNumber();

//     }
// }

// class FibonacciSeries {
//     void printFibonacci() {
//         int n = 10;
//         int a = 0, b = 1;
//         System.out.println("Fibonacci Series:");
//         System.out.print(a + " " + b);
//         for (int i = 2; i < n; i++) {
//             int next = a + b;
//             System.out.print(" " + next);
//             a = b;
//             b = next;
//         }
//         System.out.println("\n");
//     }
// }

// class EvenOdd {
//     void checkEvenOdd() {
//         int number = 7;
//         if (number % 2 == 0) {
//             System.out.println(number + " is Even.");
//         } else {
//             System.out.println(number + " is Odd.");
//         }
//         System.out.println();
//     }
// }

// class LargestNumber {
//     void checkLargestNumber() {
//         int a = 12, b = 45, c = 7;
//         if (a >= b && a >= c)
//                 System.out.println(a + " is the largest number.");
//             else if (b >= a && b >= c)
//                 System.out.println(b + " is the largest number.");
//             else
//                 System.out.println(c + " is the largest number.");
//     }
// }


// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println("Integer Addition: " + calc.add(5, 10));
//         System.out.println("Double Addition: " + calc.add(5.5, 10.2));
//     }
// }


// Polymorphism with Inheritance
class Animal {   
    void sound() {

        System.out.println("This animal makes a sound.");

    }
}

class Cat extends Animal {
    @Override
    void sound() {
        
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat(); 
        myAnimal.sound();
    }
}
 