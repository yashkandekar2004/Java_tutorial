public class ternary {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int max = (a > b) ? a : b;
        // System.out.println("The maximum value is " + max);

        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "Failed";
        
        System.out.println("The grade is: " + grade);
    }
}
