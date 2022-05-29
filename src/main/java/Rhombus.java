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
}
