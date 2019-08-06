package Lab25;

public class Main {
    public static final long STEPS = 1000000L;
    public static double Integral (double a, double b, MathFunction f)
    {
        double h = (b-a)/STEPS;
        double summa = 0.0;
        for(long i = 0; i < STEPS; i++){
            double x = a+h*i+h/2;
            double y = Math.sin(x);
            summa += y*h;
        }
        return summa;
    }

    public static void main(String[] args) {
        double r = Integral(0, Math.PI / 2,
                new MathFunction() {
                    @Override
                    public double F(double x) {
                        return Math.pow(Math.sin(x), 2.0);
                    }
                });
        System.out.printf("Integral : %g", r);
    }
}
