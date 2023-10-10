package Homeworks.HW6;

public class Triangle extends Figure{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateSquare(){
        double halfOfPerimeter = (side1 + side2 + side3)/2;
        double result = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - side1) * (halfOfPerimeter - side2) * (halfOfPerimeter - side3));
        return result;
    }
    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }
}
