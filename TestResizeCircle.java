package Buoi9;

public class TestResizeCircle {
    public static void main(String[] args) {
        GeometricObject g1 = new ResizableCircle(5.0);
        System.out.println(g1);
        g1.getArea();
        g1.getPerimeter();
        System.out.println(g1);


    }
}
