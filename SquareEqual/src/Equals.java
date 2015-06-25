/**
 * Solving square equal
 * Created by Ryabenkiy Sergey on 19.06.2015.
 */

import java.util.Scanner;


public class Equals {


    public static void main(String[] args) {
        Descriminant ds = new Descriminant();
        Scanner input = new Scanner(System.in);
// enter data
        do {

            System.out.println("\n Enter factor a: ");
            ds.a = input.nextDouble();
            if (ds.a == 0) {
                System.out.println("Factor a can not be equal zero");
                continue;
            }
            System.out.println("Enter factor b: ");
            ds.b = input.nextDouble();
            System.out.println("Enter factor c: ");
            ds.c = input.nextDouble();
            ds.equal(ds.a, ds.b, ds.c);
        }
        while (true);


    }

}

