package Homeworks.HW8;

public class Plane implements Flyable{
    private String model;
    public Plane(String model){
        this.model = model;
    }
    @Override
    public void fly(){
        System.out.println("This " + model + " flies at a great height");
    }
}
