import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Testlist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        measureTime(list);
        measureTime(list1);

        }
    public static void measureTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i=0; i<1000000;i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("dsd " + (end-start));


    }
}