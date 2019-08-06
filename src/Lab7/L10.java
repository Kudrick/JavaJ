package Lab7;
import java.io.*;
import static java.lang.System.out;
public class L10 {
    public static void main(String[] args) {
        int a = 1;

/*        while (a < 1000)
        {
            a *= 2;
            out.println(a);
        }*/
       a = 1001;
        do
            {
                a *=2;
                if (a ==32) continue;
                if (a ==256) break;
                out.println(a);

            }
            while (a<1000);
    }
}
