public class Circle extends Shape{
    private float radius;
    public Circle(float radius){
        super("Circle");
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
