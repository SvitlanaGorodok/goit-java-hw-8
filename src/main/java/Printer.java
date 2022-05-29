public class Printer {
    public void printShapeName(Shape shape){
        System.out.println(shape.getShapeName());
    }
    public void printShapeArea(Shape shape){
        System.out.println("Area of "+ shape.getShapeName() + " is " + shape.getArea());
    }
}
