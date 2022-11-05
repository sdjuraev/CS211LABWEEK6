package figures;

import java.util.Date;

public abstract class GeometricObject {
    String color;
    String name;
    public void dateCreated(){
        System.out.println("This "+name+" created "+ new Date().toString());
        System.out.println(name+"'s color is "+color);
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public boolean isEqual(GeometricObject object1, GeometricObject object2){
        if (object2.getArea()==object1.getArea()){
            return true;
        }
        else return false;
    }
}



