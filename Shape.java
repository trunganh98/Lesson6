package Buoi9;

abstract public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = "red";
        this.filled = true;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }

}
