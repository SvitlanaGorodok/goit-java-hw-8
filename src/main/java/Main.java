public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(6);
        Quad quad = new Quad(3);
        Quad quad2 = new Quad(3);
        Quad quad3 = new Quad(7);
        Rectangle rectangle = new Rectangle(2,6);
        Rectangle rectangle2 = new Rectangle(2,6);
        Rectangle rectangle3 = new Rectangle(7,6);
        Parallelogram parallelogram = new Parallelogram(5,6);
        Parallelogram parallelogram2 = new Parallelogram(5,6);
        Parallelogram parallelogram3 = new Parallelogram(6,6);
        Rhombus rhombus = new Rhombus(5,2);
        Rhombus rhombus2 = new Rhombus(5,2);
        Rhombus rhombus3 = new Rhombus(7,2);
        Triangle triangle = new Triangle(5,6);
        Triangle triangle2 = new Triangle(5,6);
        Triangle triangle3 = new Triangle(6,6);
        Printer printer = new Printer();
        printer.printShapeArea(circle);
        printer.printShapeArea(quad);
        printer.printShapeArea(rectangle);
        printer.printShapeArea(parallelogram);
        printer.printShapeArea(rhombus);
        printer.printShapeArea(triangle);
        System.out.println(parallelogram.equals(parallelogram2));
        System.out.println(parallelogram.equals(parallelogram3));
        System.out.println(circle.equals(circle2));
        System.out.println(circle.equals(circle3));
        System.out.println(triangle.equals(triangle2));
        System.out.println(triangle.equals(triangle3));
        System.out.println(rhombus.equals(rhombus2));
        System.out.println(rhombus.equals(rhombus3));
        System.out.println(quad.equals(quad2));
        System.out.println(quad.equals(quad3));
        System.out.println(rectangle.equals(rectangle2));
        System.out.println(rectangle.equals(rectangle3));
    }
}
