package arr;
import static java.lang.System.out;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class L16 {
    public static void main(String[] args) throws IOException {

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] m = new int [7];
        for (int i = 0; i < m.length ; i++)
        {


            m [i] = Integer.parseInt(reader.readLine());
            out.println(m[i]);

        } */


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
ArrayList<String> list = new ArrayList<String>();
String name;
do {
    name = reader.readLine();
    if (!name.isEmpty())
        list.add(name);
}while (!name.isEmpty());
    String [] m = (String[]) list.toArray();
Arrays.sort(m);

    }
}
