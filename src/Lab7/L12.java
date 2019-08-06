package Lab7;
import java.io.*;
import java.util.*;
import static java.lang.System.out;
public class L12 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        int n = n1 + n2;

        while (n < 1000)
        {
            out.printf("%d ", n);
            n1 = n2;
            n2 = n;
            n = n1 + n2;
        }

        Random r = new Random();
        int x = r.nextInt(100)+1;
    }
}
