public class Square extends Shape {
    private int width;

    public Square(String name, int width) {
        super(name);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;

    }

    @Override
    public String toString() {
        return "Square " +
                "width = " + width +" "+super.toString();
    }
}
