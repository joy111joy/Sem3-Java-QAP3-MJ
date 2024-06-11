package Problem3;

public class Point {
    //instance variables
    private Float x;
    private Float y;

    //constructor
    public Point (Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    //No-arg constructor
    public Point () {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    //getters and setters
    public Float getX () {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY () {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public void setXY (Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Float[] getXY () {
        Float[] arr = {x, y};
        return arr;
    }

    //toString
    @Override
    public String toString () {
        return "(" + x + ", " + y + ")";
    }

    


}
