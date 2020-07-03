/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 13:24
 **/

public class Circle {
    private double radius;
    private double pi=3.14;

    public static void main(String[] args) {
        Circle circle=new Circle(10);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }

    public Circle(){
        System.out.println("have a circle");
    }

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double area(){
        return pi*radius*radius;
    }

    public double perimeter(){
        return 2*pi*radius;
    }

}
