/**
 * Solving square equal
 * Created by Ryabenkiy Sergey on 19.06.2015.
 */
public class Descriminant {
    double a;
    double b;
    double c;
    double x1;
    double x2;
    double D;

    public void equal(double a, double b, double c) {
        D = ((b * b) - 4 * a * c);
        System.out.println("Descriminant D = " + D);
        if (D > 0 || D == 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("Root x1 = " + x1);
            System.out.println("Root x2 = " + x2);

        } else if (D < 0)
            System.out.println("Equal has not roots");

    }


}

