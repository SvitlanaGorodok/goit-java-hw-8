import java.util.Objects;

public class Rectangle extends Shape{
    private float height;
    private float wight;
    public Rectangle(float height, float wight){
        super("Rectangle");
        this.height = height;
        this.wight = wight;
    }
    public float getHeight() {
        return height;
    }
    public float getWight() {
        return wight;
    }
    @Override
    public double getArea(){
        return height * wight;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && wight == rectangle.wight;
    }
    @Override
    public int hashCode() {
        return Objects.hash(height, wight);
    }
}
