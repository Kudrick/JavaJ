package Lab7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;
public class L8 {
    public static void main(String[] args) throws IOException {
        //int a = 9;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        out.println("Введите число: ");
        int a = Integer.parseInt(reader.readLine());

        String s = "";

        switch (a)
        {
            case 1:
                s = "Один";
                break;
            case 2:
                s = "Два";
                break;
            case 3:
                s = "Три";
                break;
            case 4:
                s = "Четыре";
                break;
            case 5:
                s = "Пять";
                break;
            case 6:
                s = "Шесть";
                break;
            case 7:
                s = "Семь";
                break;
            case 8:
                s = "Восемь";
                break;
            case 9:
                s = "Девять";
                break;
            default:
                out.println("Много");
        }
        out.println(s);

    }
}
