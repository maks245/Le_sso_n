package Homeworks.HW6Updated;


public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Square(4.0);
        figures[1] = new Triangle(4, 4, 4);
        figures[2] = new Triangle(4,2);
        figures[3] = new Triangle(5,3,7.8);
        figures[4] = new Circle(4.0);
        for (Figure figure : figures) {
            System.out.println(figure.calculatePerimeter());
            System.out.println(figure.calculateSquare());
        }

    }
}
