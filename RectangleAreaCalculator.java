public class RectangleAreaCalculator {
    
    // First approach: Calculate area with parameters and return result
    public double calculateAreaWithParameters(double length, double breadth) {
        return length * breadth;
    }

    // Second approach: Calculate area without return (just print the result)
    public void calculateAreaWithoutReturn() {
        double length = 5.0;
        double breadth = 3.0;
        double area = length * breadth;
        System.out.println("Area of rectangle (without return)  : " + area);
    }

    // Third approach: Calculate area with parameters and print the result
    public void calculateAreaWithParametersNoReturn(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle (with parameters, no return): " + area);
    }

    // Fourth approach: Calculate area without parameters and return result
    public double calculateAreaWithoutParameters() {
        double length = 7.0;
        double breadth = 4.0;
        return length * breadth;
    }

    public static void main(String[] args) {
        RectangleAreaCalculator calculator = new RectangleAreaCalculator();

        // Test First Approach: calculate area with parameters and return result
        double length1 = 6.0;
        double breadth1 = 3.0;
        double area1 = calculator.calculateAreaWithParameters(length1, breadth1);
        System.out.println("Area of rectangle (first approach): " + area1);

        // Test Second Approach: calculate area without return (print the result)
        calculator.calculateAreaWithoutReturn();

        // Test Third Approach: calculate area with parameters and print result
        double length2 = 8.0;
        double breadth2 = 2.0;
        calculator.calculateAreaWithParametersNoReturn(length2, breadth2);

        // Test Fourth Approach: calculate area without parameters and return result
        double area4 = calculator.calculateAreaWithoutParameters();
        System.out.println("Area of rectangle (fourth approach): " + area4);
    }
}
