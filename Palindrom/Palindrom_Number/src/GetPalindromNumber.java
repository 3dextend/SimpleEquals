import java.util.Scanner;

/**
 * Palindrom
 * Created by Ryabenkiy Sergey on 29.08.2015 1:15.
 */
public class GetPalindromNumber {
    // palindrom function
    protected static int GetPalindrome(int pal)
    {
        int next = 0;
        int pal2 = pal;

        while (pal2 != 0)
        {
            next = (next * 10) + (pal2 % 10);
            pal2 /= 10;
        }

        if (pal == next)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int n;
        int result;
        do {
            System.out.println("\nВведите число для проверки:");
            n = input.nextInt();
            result=GetPalindrome(n);
            if(result==1){
                System.out.println("Число палиндром");
            }
            else {
                System.out.println("Число не палиндром");
            }
        }
        while (true);
    }
}
