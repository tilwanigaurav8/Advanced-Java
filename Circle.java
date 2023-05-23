import java.util.*;

public class Circle{
    private double radius;
    public Circle(double r){
        radius =r;
    }

    public double getP(){
        return 2*radius*Math.PI;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public static void main(String[] args){
        Circle c=new Circle(4);
        double a=c.getArea();
        double p=c.getP();
        System.out.println("Perimeter of Circle is :"+a);
        System.out.println("Area of Circle is :"+a);
    }
}