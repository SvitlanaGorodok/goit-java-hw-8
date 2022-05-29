public abstract class Shape{
    private String shapeName;
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    public String getShapeName() {
        return shapeName;
    }
    public abstract double getArea();
    //public abstract String getShapeName();
}
