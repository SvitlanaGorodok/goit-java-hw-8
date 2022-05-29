import java.util.Objects;

public class Parallelogram extends Shape{
    private float height;
    private float base;
    public Parallelogram(float height, float base){
        super("Parallelogram");
        this.height = height;
        this.base = base;
    }
    public float getHigh() {
        return height;
    }
    public float getBase() {
        return base;
    }
    @Override
    public double getArea(){
        return height * base;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram parallelogram = (Parallelogram) o;
        return height == parallelogram.height && base == parallelogram.base;
    }
    @Override
    public int hashCode() {
        return Objects.hash(height, base);
    }
}
