public class Triangle extends Shape {
    private int leg1;
    private int leg2;
    private int median;

    public Triangle(String name, int leg1, int leg2, int median) {
        super(name);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.median = median;
    }

    public int getLeg1() {
        return leg1;
    }

    public void setLeg1(int leg1) {
        this.leg1 = leg1;
    }

    public int getLeg2() {
        return leg2;
    }

    public void setLeg2(int leg2) {
        this.leg2 = leg2;
    }

    public int getMedian() {
        return median;
    }

    public void setMedian(int median) {
        this.median = median;
    }

    @Override
    public double getPerimeter() {
        return leg1+leg2+median;
    }

    @Override
    public String toString() {
        return "Triangle " +
                " leg1 =" + leg1 +
                ", leg2 =" + leg2 +
                ", median =" + median +" "+super.toString();
    }
}
