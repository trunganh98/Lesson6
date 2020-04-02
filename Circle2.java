package Buoi9;

public class Circle2 implements GeometricObject {
    private double radius = 1.0;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle2[radius=" + radius + "]";
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
