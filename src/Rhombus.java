public class Rhombus extends Shape {
    private int length;

    public Rhombus(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Rhombus " +
                " length =" + length +" "+super.toString();
    }
}
