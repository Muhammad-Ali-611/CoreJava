package Java;

public class LargstAmongThreeNumbers {

    public static void main(String[] args) {

        int x = 300;
        int y = 200;
        int z = 100;

        if (x > y && x > z) {
            System.out.println("x is the greatest");
        } else if (y > z) {
            System.out.println("y is the greatest");
        } else {
            System.out.println("z is the greatest");
        }
    }
}
