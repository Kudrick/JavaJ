package fact;

public class Factorr {
    public static void main(String[] args) {
        //int z = 0;
        //z += y *factor(5);

        System.out.println(factor(4));

    }

    public static int factor (int x){
        System.out.printf("xxx: %d\n",x);
        if (x == 1)
        {
             return 1;
        }
        return x * factor(x - 1);

    }
}
