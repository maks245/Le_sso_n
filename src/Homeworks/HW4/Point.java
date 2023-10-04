package Homeworks.HW4;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void info(){
        System.out.println("Coordinate of point: (" + x + ", " + y + ")" );
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}


