package Homeworks.HW6;

public class Square extends Figure{
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateSquare(){
        return side * side;
    }
    @Override
    public double calculatePerimeter(){
        return 4 * side;
    }
}
