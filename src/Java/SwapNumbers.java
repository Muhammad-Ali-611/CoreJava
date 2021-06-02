package Java;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping");
        System.out.println("a = " + a );
        System.out.println("b = " + b);

        System.out.println("After Swapping");

        int temp ;
        temp = a ;
        a = b;
        b = temp;
    }
}
