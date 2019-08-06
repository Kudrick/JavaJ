package Lab3.ru.spec.math;

import Lab3.PersonL;

public class Test {
   public  void incrementAge(PersonL p){
       p.Age++;

   }



    public double average (int a, int b){
    a++;
        System.out.printf("a = %d\n b = %d\n", a,b);
        double avg = (a + b) / 2D;
        return avg;
    }
}
