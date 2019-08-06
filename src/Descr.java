
import java.io.*;
import static java.lang.System.out;
public class Descr {


    public static void main(String[] args) throws IOException {

out.println("Решение квадратного уравнения");
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

out.print("a= ");
double a = Double.parseDouble(reader.readLine());
        out.print("b= ");
        double b = Double.parseDouble(reader.readLine());
        out.print("c= ");
        double c = Double.parseDouble(reader.readLine());

        double d = Math.pow(b, 2) - 4*a*c;

        if (d<0)
            out.println("Корней нет");
        else
            if (d == 0)
            {
                double x = -b/(2*a);
                out.printf("Единственный корень x = %g", x);
            }
            else
            {
                double ds = Math.sqrt(d);
                double x1 = (-b+ds)/(2*a);
                double x2 = (-b+ds)/(2*a);
                out.printf("X1 = %g/n X2 = %g", x1, x2);
            }

    }
}
