package Problem2;

public class Circle extends Shape {
    //instance variables
    private double radius;


    //No-arg constructor
    public Circle () {
        super();
        this.radius = 1.0;
    }
    //constructor
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //gettters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //getArea
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //getPerimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //toString
    public String toString() {
        return "Circle[" + super.toString() + "Radius: " + radius + "]";
    }

}
