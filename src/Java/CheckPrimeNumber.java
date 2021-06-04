package Java;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        // Java program to check Whether a number can be expressed as sum of two
        //Prime Numbers
        //34 = 3 + 31 5 + 29 11 + 23 17+17
       // 11

        int num = 34;
        boolean flag = false;

        for (int i = 2; i <= num/2; i ++){
            if ( checkPrimeNumber(i)){

                if (checkPrimeNumber(num - i)){
                    System.out.println(num + " = " + i + " + " + (num - i));
                    flag = true;
                }

            }
        }
        if (!flag){
            System.out.println(num + " can not be expressed as the sum of two prime Numbers");
        }
    }
    public static boolean checkPrimeNumber(int num){
        boolean isPrime = true;
        for (int i = 2; i<= num/2; i ++){
        if (num % i == 0){
            isPrime = false;
            break;
        }
        }
        return isPrime;
    }

}
