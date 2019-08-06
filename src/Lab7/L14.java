package Lab7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;
public class L14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = "привет"; // null
        String s2 = reader.readLine();

        if (s1.equals(s2))
            out.println("РАВНО");
        else
            out.println("НЕ РАВНО");
        //if (s.isEmpty());
        //out.println(s1.toUpperCase());
        //out.println(s1);

    }
}
