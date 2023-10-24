package Homeworks.HW8;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mykola");
        Plane plane = new Plane("boeing 747");
        Fish fish = new Fish("Clown");
        Bird bird = new Bird("Sparrow");
        person.swim();
        plane.fly();
        fish.swim();
        bird.fly();
    }
}
