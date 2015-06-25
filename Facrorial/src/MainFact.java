import java.util.Scanner;

/**
 * IdeaProjects
 * Created by Ryabenkiy Sergey on 20.06.2015 14:12.
 */
public class MainFact {
    public static void main (String[] args){
        FactFunct factor = new FactFunct();
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("\nEnter Integer Number n: ");
            factor.n = input.nextInt();
            if(factor.n < 0){
                System.out.println("Number can not be less then zero");
                continue;
            }

            System.out.println("Factorial of number " + factor.n + " = " + factor.factFunct(factor.n));
        }
        while (true);

    }

    }

