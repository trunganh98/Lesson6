package Buoi9;

public class ResizableCircle extends Circle2 implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        return "ResizableCircle=" + getArea() + "," + getPerimeter();
    }

    @Override
    public double resize(int percent) {
        return this.resize(percent);
    }
}
