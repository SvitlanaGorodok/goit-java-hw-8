public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Quad quad = new Quad();
        Rectangle rectangle = new Rectangle();
        Parallelogram parallelogram = new Parallelogram();
        Rhombus rhombus = new Rhombus();
        Triangle triangle = new Triangle();
        Printer printer = new Printer();
        printer.printShapeArea(circle);
        printer.printShapeName(quad);
        printer.printShapeName(rectangle);
        printer.printShapeName(parallelogram);
        printer.printShapeName(rhombus);
        printer.printShapeName(triangle);
    }
}
