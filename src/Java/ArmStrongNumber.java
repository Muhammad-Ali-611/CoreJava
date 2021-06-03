package Java;

public class ArmStrongNumber {
    public static void main(String[] args) {

        //153 ==> 1 * 1* 1

        int num = 153;
        int actualNum = num;
        double result = 0;

        while (actualNum != 0){

            int n = actualNum % 10;
            result = result + Math.pow(n,3);
            actualNum = actualNum/10;

        }
        if (result == num ){
            System.out.println(num + " is an ArmStrongNumber");
        }else {
            System.out.println(num + " is not an ArmStrongNumber");

        }
    }
}
