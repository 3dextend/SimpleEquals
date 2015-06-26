/**
 * IdeaProjects
 * Created by Ryabenkiy Sergey on 23.06.2015 22:54.
 */
public class FunctFibonacci {
    public int n;

    public int fibFunct(int n) {
        int numbforv = 1; // чило n-1
        int numbback = 1; // число n-2
        int numbfib = 0; // результат
        if (n == 0) {
            return 0;

        } else if (n == 1 || n == 2) {
            return 1;

        } else {
            for (int i = 2; i < n; i++) {

                numbfib = numbforv + numbback;
                numbforv = numbback;
                numbback = numbfib;

             /*
             * Рекурсивный метод получения чисел Фибоначчи

              numbfib = fibFunct(n-1)+fibFunct(n-2);

              */


            }
            return numbfib;
        }


    }
}
