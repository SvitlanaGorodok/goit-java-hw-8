public class Quad extends Shape{
    private float side;
    public Quad(float side){
        super("Quad");
        this.side = side;
    }
    public float getSide() {
        return side;
    }
    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }

}
