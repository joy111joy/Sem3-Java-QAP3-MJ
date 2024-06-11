package Problem2;

public class Rectangle extends Shape {
    //instance variables
    protected double width;
    protected double length;

    //No-arg constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    //constructor
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //getArea
    public double getArea() {
        return width * length;
    }

    //getPerimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    //toString
    public String toString() {
        return "Rectangle[" + super.toString() + "Width: " + width + "Length: " + length + "]";
    }
    
}
