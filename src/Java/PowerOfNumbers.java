package Java;

public class PowerOfNumbers {
    public static void main(String[] args) {

        int base = 4;
        int exponent = 4;

        long result = 1;
        while (exponent != 0){
             result *= base;
             --exponent;
        }
        System.out.println(result);
    }
}
