package Lab26;

public class Main {
    public static void main(String[] args) {
Accumulator<String> acc1 = new
        Accumulator<String>("Начало ");
acc1.Add("Привет");
Accumulator<Integer> acc2 = new
        Accumulator<Integer>(123);
acc2.Add(137);

        System.out.printf("%s %d", acc1.getAcc(), acc2.getAcc());
    }
}
