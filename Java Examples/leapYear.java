public class leapYear {
    int year = 2000;
    public void  checkYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");
            } else
                System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
    }
    public static void main(String[] args) {
        leapYear ly = new leapYear();
        ly.checkYear();
    }
}
