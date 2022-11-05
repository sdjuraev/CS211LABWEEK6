package figures;

public class Rectangle extends GeometricObject{
    private double side1=0;
    private double side2=0;
    Rectangle(double side1, double side2){
        this.side1=side1;
        this.side2=side2;
    }
    @Override
    public double getArea() {
        double area=side1*side2;
        return area;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
