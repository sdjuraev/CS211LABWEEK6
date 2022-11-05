package figures;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle=new Rectangle(10,10);
        Circle circle=new Circle(1);
        if (circle.isEqual(rectangle, circle)){
            System.out.println("Yes");
        }
        else System.out.println("False");
    }
}
