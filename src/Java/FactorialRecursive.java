package Java;

public class FactorialRecursive {
    public static void main(String[] args) {

       System.out.println(multiplication(5));
    }
    public static int multiplication(int num){
        if (num >= 1){
            return num * multiplication(num - 1);
        }
        else {
            return 1;
        }
    }

}
