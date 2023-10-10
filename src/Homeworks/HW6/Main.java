package Homeworks.HW6;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Square(4.0);
        figures[1] = new Triangle(4.0, 4.0, 4.0);
        figures[2] = new Circle(4.0);
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].calculatePerimeter());
            System.out.println(figures[i].calculateSquare());
        }

    }
}
