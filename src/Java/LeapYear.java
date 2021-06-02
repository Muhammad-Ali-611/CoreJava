package Java;

public class LeapYear {

    public static void main(String[] args) {

        //divisible by 4 for all the century year -- ending with 80
        // Century year is leap year only when its perfectly divisible by 40

        // 1900 is not a  leap year
        // 2012 is a leap year

        int year = 1900;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {

                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println(year + " is a leap year ");
        }else {

            System.out.println(year + " is not a leap year ");

        }
    }
}
