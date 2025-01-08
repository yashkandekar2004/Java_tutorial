public class typeconversion {
    public static void main(String[] args) {
        // type conversion
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);

        // type conversion (casting)
        double d = 100.04;
        long l2 = (long) d;
        int i2 = (int) l2;
        System.out.println("Double value: " + d);
        System.out.println("Long value after casting: " + l2);
        System.out.println("Int value after casting: " + i2);
    }
}
