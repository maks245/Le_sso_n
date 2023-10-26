package Homeworks.HW9;

import Homeworks.HW6.Figure;

public class Circle extends Figure {
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }
    @Override
    public double calculateSquare(){
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
