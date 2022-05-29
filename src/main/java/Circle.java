import java.util.Objects;

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
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
