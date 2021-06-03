package Java;

public class PallindromNumber {
    public static void main(String[] args) {

        int num = 1331;
        int rev = 0;

        int actualNumber = num;
        while (num != 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num / 10;
        }
        System.out.println(rev);

        if (actualNumber == rev) {
            System.out.println(actualNumber + " is a PallindromNumber");
        } else {
            System.out.println(actualNumber + " is not a pallindromNumber");
        }
    }
}
