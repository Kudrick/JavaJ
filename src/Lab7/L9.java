package Lab7;
import java.io.*;
import static java.lang.System.out;
public class L9 {
    public static void main(String[] args)
    {

/*        for (int i = 1; i <= 1024; i *= 2)
            out.println(i);


        for (int i = 0; i < 10; i++)
        {
            if (i == 3) continue;
            if (i == 8) break;
            out.println(i);
        }
        out.println("Exit");
    }*/
            for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                int n = i * j;
                out.printf("%4d", n);
            }
            out.println();
        }
     }

        }


