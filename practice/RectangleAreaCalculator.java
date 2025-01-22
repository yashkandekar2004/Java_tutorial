public class RectangleAreaCalculator {
    //first approach
    public double calculateAreaWithParameters(double length, double width) {
        return length * width;
    }

    // Second Approach
    public void calculateAreaWithoutReturn() {
        double length = 5.0;
        double width = 3.0;
        double area = length * width;
        System.out.println("Area of rectangle " + area);
    }

    // Third Approach
    public void calculateAreaWithParametersNoReturn(double length, double width) {
        double area = length * width;
        System.out.println("Area of rectangle " + area);
    }

    // Fourth Approach
    public double calculateAreaWithoutParameters() {
        double length = 7.0;
        double width = 4.0;
        return length * width;
    }

    public static void main(String[] args) {
        RectangleAreaCalculator calculator = new RectangleAreaCalculator();

        double length1 = 6.0;
        double width1 = 3.0;
        double area1 = calculator.calculateAreaWithParameters(length1, width1);
        System.out.println("Area of rectangle " + area1);

        calculator.calculateAreaWithoutReturn();

        double length2 = 8.0;
        double width2 = 2.0;
        calculator.calculateAreaWithParametersNoReturn(length2, width2);

        double area4 = calculator.calculateAreaWithoutParameters();
        System.out.println("Area of rectangle " + area4);
    }
}
