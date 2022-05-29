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
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && base == triangle.base;
    }
}
