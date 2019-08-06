package Lab3;
import Lab3.PersonL.*;
import static java.lang.System.out;
import Lab3.ru.spec.math.Test;
public class Main {
    public static void main(String[] args) {
        PersonL p1 = new PersonL();
        p1.Name = "Сергей";
        p1.Age = 33;
        PersonL p2 = p1;
        p2.Age = 4;


       // out.printf("%s - %d\n", p1.Name, p1.Age);
        Test t1 = new Test();
        p1.show();
        t1.incrementAge(p1);
        p1.show();


        p1 = null;
        p2 = null;

        int a = 5;
        int b = a;
        b = 7;

        Test t2 = new Test();
        int x = 10;
        int y = 20;
        double r = t2. average(x, y);
        out.printf("r = %.3g\n", r);
        out.printf("x = %d\n y = %d\n", x,y);

    }
}
