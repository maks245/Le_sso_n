package Homeworks.HW8;

public class Bird implements Flyable{
    private String birdType;

    public Bird(String birdType){
        this.birdType = birdType;
    }
    @Override
    public void fly(){
        System.out.println(birdType + " flies at a low height");
    }
}
