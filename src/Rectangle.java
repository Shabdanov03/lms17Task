public class Rectangle extends Shape {

    private int width;
    private int length;

    public Rectangle(String name, int width, int length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return width + length + width + length;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                " width =" + width +
                ", length =" + length +" "+super.toString();
    }
}
