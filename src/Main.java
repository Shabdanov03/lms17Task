public class Main {
    public static void main(String[] args) {

        Shape paralelogram = new Parallelogram("Паралелограм", 3, 5);
        Shape square = new Square("Квадрат", 4);
        Shape triangle=new Triangle("Триугольник",2,2,4);
        Shape rhombus = new Rhombus("Ромб",6);
        Shape rectangle = new Rectangle("Прямоугольник",4,7);
        System.out.println(paralelogram);
        System.out.println(paralelogram.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(square);
        System.out.println(square.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(rhombus);
        System.out.println(rhombus.getPerimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());


    }
}