import java.util.ArrayList;
import java.util.Scanner;

/**
 * IdeaProjects
 * Created by Ryabenkiy Sergey on 23.06.2015 22:54.
 */
public class MainFibonacci {
    public static void main (String[] args){
        FunctFibonacci fib = new FunctFibonacci();
        Scanner input = new Scanner(System.in);
        int result;
        do {

            System.out.println("\nEnter Integer Number n: ");
            fib.n = input.nextInt();
            if(fib.n < 0){
                System.out.println("Number n can not be less then zero");
                continue;
            }
            for (int i=0; i<=fib.n; i++){
                result = fib.fibFunct(i);
                System.out.println("Fibonacci of number " + i + " = " + result);


            }

        }
        while (true);

    }
}
