/**
 * IdeaProjects
 * Created by Ryabenkiy Sergey on 20.06.2015 15:05.
 */
public class FactFunct {
    //int subst;
    int n;
    public Integer factFunct(int n){
        //int fact=1;
        if (n == 0 || n ==1){
            return 1;
        }
        /*for (int i=n; i>0; i--){
            subst = n--;
            fact *= subst;
        }*/
        return factFunct(n-1)*n;
    }


}
