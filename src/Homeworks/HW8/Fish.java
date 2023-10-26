package Homeworks.HW8;

public class Fish implements Swimmable{
    private String fishType;
    public Fish(String fishType){
        this.fishType = fishType;
    }
    @Override
    public void swim(){
        System.out.println(fishType + " can swim");
    }
}
