public class Rectangle extends Shape{
    private float height;
    private float weight;
    public Rectangle(float height, float weight){
        super("Rectangle");
        this.height = height;
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public float getWeight() {
        return weight;
    }
    @Override
    public double getArea(){
        return 0f;
    }
}
