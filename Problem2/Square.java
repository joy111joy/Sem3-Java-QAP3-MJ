package Problem2;

public class Square extends Rectangle {
    //No-arg constructor
    public Square() {
        super();
    }

    //constructor
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }


    //getters and setters
    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    //toString
    public String toString() {
        return "Square[" + super.toString() + "Side: " + super.getWidth() + "]";
    }


    
}
