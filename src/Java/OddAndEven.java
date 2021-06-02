package Java;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Plz enter a num");

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + "is even" );
        }
        else {
            System.out.println(number + "is odd");
        }

    }
}
