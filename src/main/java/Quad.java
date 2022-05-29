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
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return side == quad.side;
    }
}
