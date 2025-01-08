public class forLoop {
    public static void main(String[] args) {
        int tableOf = 5;
        System.out.println("Multiplication Table for " + tableOf + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }
    }
}

