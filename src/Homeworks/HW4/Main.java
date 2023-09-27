package Homeworks.HW4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("-----1-----");
        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;
        System.out.println("Value a1: " + a1.getX());
        System.out.println("Value a2: " + a2.getX());
        a2.setX(6);
        System.out.println("Changed value a1: " + a1.getX());
        System.out.println("Changed value a2: " + a2.getX());

        System.out.println("-----2-----");

        Point[] points = new Point[4];
        points[0] = new Point(2, 5);
        points[1] = new Point(4,8);
        points[2] = new Point(2,6);
        points[3] = new Point(5,1);
        System.out.println("All points:");
        for (Point point : points) {
            point.info();
        }
        System.out.println("Points where x and y coordinates multiples of 2: ");
        for (Point point: points) {
            if(point.getX() % 2 == 0 && point.getY() % 2 == 0){
                point.info();
            }
        }

    }
}
