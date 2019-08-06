public class Fact {
    public static void main(String[] args) {
        System.out.println(fac(4));
    }

    private static int fac(int n) {

        int qq=1;
        //int ww;
        if (n != 1) {
            qq = fac(n - 1);
        }

        int ww = n * qq;
        return ww;
    }
}