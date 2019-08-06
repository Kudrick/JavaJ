
package collection;
import com.sun.javafx.collections.MappingChange;

import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        List<String> array = new ArrayList<String>();
        array.add("DSDS");
        array.add("jhjhjh");
        array.add("Сергей");

        for(Object o : array)
            out.println(o);

        for(int i = 0; i < array.size(); i++)
            out.println(array.get(i));


        Map<String, Integer> persons =
                new Hashtable<String, Integer>();
        persons.put("dsd", 33);
        persons.put("kjkkj", 5);
        persons.put("popo", 37);

        for(Map.Entry<String, Integer> p : persons.entrySet());
        {
            //out.printf("%s %d\n", p.getKey(), p.getValue());
        }

    }
}
