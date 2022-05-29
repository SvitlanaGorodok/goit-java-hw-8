import java.util.Objects;

public class Rhombus extends Shape{
    private float diagonal1;
    private float diagonal2;
    public Rhombus(float diagonal1, float diagonal2){
        super("Rhombus");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    public float getDiagonal1() {
        return diagonal1;
    }
    public float getDiagonal2() {
        return diagonal2;
    }
    @Override
    public double getArea(){
        return (diagonal1 * diagonal2) / 2;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhombus rhombus = (Rhombus) o;
        return diagonal1 == rhombus.diagonal1 && diagonal2 == rhombus.diagonal2;
    }
    @Override
    public int hashCode() {
        return Objects.hash(diagonal1, diagonal2);
    }
}
