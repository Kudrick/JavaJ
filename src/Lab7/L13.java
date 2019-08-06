package Lab7;
import java.io.*;
import java.util.*;
import static java.lang.System.out;
public class L13 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int x = r.nextInt(100) + 1;
        // out.println(x);
        int y, counter = 0;
        do {
            out.println("Угадай число: ");
            y = Integer.parseInt(reader.readLine());
            counter++;
            if (y == 0) break;

            if (y > x)
                out.println("Много");
            if (y < x)
                out.println("Мало");
        }
        while ((y != x) && (counter < 7));

        if (y == x)
            out.printf("Вы выиграли. Число попыток: %d\n", counter);
        else
            out.println("вы проиграли");
    }
}
