package Buoi9;

public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        this.side = side;
    }
    public Square(double side) {
        super();
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super();
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = side;
    }
    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square[Rectangle[Shape[color=" + getColor() + ",filled=" + isFilled() + "],width=" + getWidth() + ",length=" + getLength() + "]]";
    }
}
