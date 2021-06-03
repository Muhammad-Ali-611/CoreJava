package Java;

public class NaturalNumbersSum {

    public static void main(String[] args) {

        int num = 100;
        int sum = 0;

        //1+2+3+4 ...+100..+5050

        for (int i = 0; i <= num; i++){
            sum = sum + i;

        }
        System.out.println(" sum is :" + sum);
    }
}
