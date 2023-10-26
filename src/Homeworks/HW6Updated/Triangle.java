package Homeworks.HW6Updated;

public class Triangle extends Figure{
    private int side1;
    private int side2;
    private int side3;
    private int height;
    private double corner;
    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(int side1, int side2, double corner){
        this.side1 = side1;
        this.side2 = side2;
        this.corner = corner;
    }
    public Triangle(int side1, int height){
        this.side1 = side1;
        this.height = height;

    }


    @Override
    public double calculateSquare() {
        if (height != 0) {
            return calculateSquare(side1, height);
        } else if (corner != 0) {
            return calculateSquare(side1, side2, corner);
        } else {
            return calculateSquare(side1, side2, side3);
        }
    }

    private double calculateSquare(int side1, int side2, int side3){
        double halfOfPerimeter =( (double) side1 + side2 + side3)/2;
        double result = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - side1) * (halfOfPerimeter - side2) * (halfOfPerimeter - side3));
        return result;
    }

    private double calculateSquare(int side1, int side2, double corner){

        double result = ((double) side1 * side2)/2 * Math.sin(corner);
        return result;
    }


    private double calculateSquare(int side1, int height){
        double result = 0;
        if(height != 0) {
            result = ((double) side1 / 2 * height);
        }
        return result;
    }
    @Override
    public double calculatePerimeter(){
        if(side2 == 0 || side3 == 0){
            return 0;
        }
        return side1 + side2 + side3;
    }
}