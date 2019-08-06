public class ClassesAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("");
        p1.getName();
        p1.setAge(21);
        System.out.println(p1.getName());
     }
}
class Person{
    private String name;
    private int age;
    public void setName(String userName){
        if(userName.isEmpty()){
        System.out.println("Ввел пустое имя");}
        else {name=userName;}
        }
        public String getName(){
        return name;
        }

    public void setAge(int userAge) {
        age = userAge;
    }
public int getAge(){
        return age;
}
    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void speak(){
        for (int i=0; i<3; i++) {
            System.out.println("Меня зовут " + name
                    + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет");
    }
}