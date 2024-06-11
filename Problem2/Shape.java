package Problem2;

public class Shape {
    //instance variables
    protected String color;
    protected Boolean filled;

    //No-arg constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    //constructor
    public Shape (String color, Boolean filled) {
        this.color= color;
        this.filled = filled;
    }

    //getters and setters
    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    //toString
    public String toString () {
        return "Shape[Color: " + color + "Filled: " + filled+ "]";
    }

}
