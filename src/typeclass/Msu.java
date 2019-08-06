package typeclass;

class Msu<T> {

    T ob;
    Msu (T o)
    {
        this.ob = o;
    }
    T getOb(){return ob;}
    void showType(){
        System.out.println("type = " + ob.getClass());
    }
}
class MsuUse{

    public static void main(String[] args) {
        Msu<Integer> t = new Msu<>(123);
        int v = t.getOb();
        t.showType();
        System.out.println("object =" + v);
    }
}