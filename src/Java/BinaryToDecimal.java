package Java;

public class BinaryToDecimal {
    public static void main(String[] args) {

        long num = 10011011;
        double decimal = covertBinaryToDecimal(num);
        System.out.println(decimal);
    }
    public static double covertBinaryToDecimal(long num){
        double decimalNum = 0;
        int i = 0;
        long reminder;
        while (num != 0){
            reminder = num % 10;
            num = num/10;
            decimalNum += reminder * Math.pow(2 , i);
                ++i;
            }
        return decimalNum;

    }
    }

