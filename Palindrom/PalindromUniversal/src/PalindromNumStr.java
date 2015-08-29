import java.util.Scanner;

/**
 * Palindrom
 * Created by Ryabenkiy Sergey on 29.08.2015 3:22.
 */
public class PalindromNumStr {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Введите число или слово для проверки:");
            String a = input.nextLine().toLowerCase();
            if (a.equals(new StringBuilder(a).reverse().toString())){
                System.out.println("Введенные данные палиндром");
            }
            else{
                System.out.println("Введенные данные не палиндром");
            }

        }
        while (true);
    }
}
