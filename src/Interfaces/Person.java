package Interfaces;

public class Person implements Info{

    public String name;
    public Person (String name){

        this.name = name;
    }
    public void say(){
        System.out.println("   Hello");
    }

    @Override
    public void showinfo() {
        System.out.println("blabla " + this.name);
    }
}
























