package Lab7;
import java.io.*;
import static java.lang.System.out;
    public class L11 {

        public static void main(String[] args) throws IOException {


            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

            String name = "";
            while (name.isEmpty())
            {
                out.print ("Введите ваше имя:" );
                name = reader.readLine();

            }
            out.printf("Привет, %s\n", name);
        }
    }


