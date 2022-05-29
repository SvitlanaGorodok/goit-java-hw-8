public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Quad quad = new Quad(3);
        Rectangle rectangle = new Rectangle(2,6);
        Parallelogram parallelogram = new Parallelogram(5,6);
        Rhombus rhombus = new Rhombus(5,2);
        Triangle triangle = new Triangle(5,6);
        Printer printer = new Printer();
        printer.printShapeArea(circle);
        printer.printShapeArea(quad);
        printer.printShapeArea(rectangle);
        printer.printShapeArea(parallelogram);
        printer.printShapeArea(rhombus);
        printer.printShapeArea(triangle);
    }
}
