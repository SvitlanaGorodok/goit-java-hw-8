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

}
