public class Triangle extends Shape{
    private float height;
    private float base;
    public Triangle(float height, float base){
        super("Triangle");
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
        return height * base / 2;
    }
}
