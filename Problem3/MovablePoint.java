package Problem3;

public class MovablePoint extends Point {
    //instance variables
    private Float xSpeed;
    private Float ySpeed;

    //constructor
    public MovablePoint (Float x, Float y, Float xSpeed, Float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint (Float xSpeed, Float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //No-arg constructor
    public MovablePoint () {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    //getters and setters

    public Float getXSpeed () {
        return xSpeed;
    }

    public void setXSpeed (Float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public Float getYSpeed () {
        return ySpeed;
    }

    public void setYSpeed (Float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed (Float xSpeed, Float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Float[] getSpeed () {
        Float[] arr = {xSpeed, ySpeed};
        return arr;
    }

    public MovablePoint move () {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    //toString
    @Override
    public String toString () {
        return "(" + super.getX() + ", " + super.getY() + "), speed = (" + xSpeed + ", " + ySpeed + ")";
    }



}
