package Homeworks.HW8;

public class Person implements Swimmable{
    private String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public void swim(){
        System.out.println(name + " can swim");
    }
}
