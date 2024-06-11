package Problem3;

public class Demo {
    public static void main(String[] args) {

        Point P = new Point(3.0f, 4.0f);
        System.out.println(P.toString());
        MovablePoint M = new MovablePoint(3.0f, 4.0f, 1.0f, 1.0f);
        System.out.println(M.toString());
        M.move();
        System.out.println(M.toString());
    }
    
}
