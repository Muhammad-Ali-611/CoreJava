package Java;

public class DecimalToBinary {
    public static void main(String[] args) {
         long Binary = convertToDecimalToBinary(156);
         System.out.println(Binary);

    }
    public static long convertToDecimalToBinary(int n){
        long Binary = 0;
        int reminder = 1, i = 1;

        while (n != 0){
            reminder = n % 2;
            n = n/2;
            Binary +=  reminder * i;
            i *= 10;

        }
        return Binary;
    }
}
