package Problem2;

public class Demo {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);
        Circle C = new Circle(5.0, "Blue", false);
        Circle C1 = new Circle(3.0, "Green", true);
        Rectangle R = new Rectangle(5.0, 6.0, "Yellow", false);
        Rectangle R1 = new Rectangle(3.0, 4.0, "Purple", true);
        Square Sq = new Square(5.0, "Orange", false);
        Square Sq1 = new Square(3.0, "Black", true);

        System.out.println();
        System.out.println(S.toString());
        System.out.println();


        System.out.println(C.toString());
        System.out.println("Area: " + C.getArea());
        System.out.println("Perimeter:" + C.getPerimeter());
        System.out.println();


        System.out.println(C1.toString());
        System.out.println("Area: " + C1.getArea());
        System.out.println("Perimeter:" + C1.getPerimeter());
        System.out.println();


        System.out.println(R.toString());
        System.out.println("Area: " + R.getArea());
        System.out.println("Perimeter:" + R.getPerimeter());
        System.out.println();


        System.out.println(R1.toString());
        System.out.println("Area: " + R1.getArea());
        System.out.println("Perimeter:" + R1.getPerimeter());
        System.out.println();


        System.out.println(Sq.toString());
        System.out.println("Area: " + Sq.getArea());
        System.out.println("Perimeter:" + Sq.getPerimeter());
        System.out.println();


        System.out.println(Sq1.toString());
        System.out.println("Area: " + Sq1.getArea());
        System.out.println("Perimeter:" + Sq1.getPerimeter());
    }
}
