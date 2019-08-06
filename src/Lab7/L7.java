
package Lab7;
import java.io.*;
import static java.lang.System.out;
public class L7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (
                new InputStreamReader(System.in));
        out.print("Введите число ворон на ветке: ");
        int n = Integer.parseInt(reader.readLine());
        String v = "";

/*        if (n == 1){
            v = "ворона";
        } else if((n >= 2) && (n <=4)){
            v = "вороны";
        } else if (((n >=5) && (n <=9)) || (n == 0)){
            v = "ворон";
        }*/
        int n1 = n % 10;
        int n2 = n % 100;

        if (n1 == 1)
            v = "ворона";

        if ((n1 >= 2) && (n1 <=4))
            v = "вороны";

         if (((n1 >=5) && (n <=9)) || (n1 == 0) || ((n2 >=11) && (n2 >=14)))
            v = "ворон";

         String result = String.format("На ветке %d %s", n, v);
         out.println(result);

    }

}
