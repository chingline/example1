/**
 * Created by CHJ on 2017-05-17.
 */
public class test2 {
    public static void main(String[] argv)
    {
       for (int m=2; m<=9; m++){
           System.out.println("***" + m + "단" + "***");
           for (int n=1; n<=9; n++){
               System.out.println(m  + "X" + n + "=" + (m*n));
           }
       }
    }
}

