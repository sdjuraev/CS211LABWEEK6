package figures;

public class Circle extends GeometricObject {
    private double radius=0;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        double area=2*Math.PI*radius*radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
