public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Rectangle rectangle = new Rectangle();
        Parallelogram parallelogram = new Parallelogram();
        Rhombus rhombus = new Rhombus();
        Triangle triangle = new Triangle();
        Printer printer = new Printer();
        printer.printShapes(circle);
        printer.printShapes(quad);
        printer.printShapes(rectangle);
        printer.printShapes(parallelogram);
        printer.printShapes(rhombus);
        printer.printShapes(triangle);
    }
}
