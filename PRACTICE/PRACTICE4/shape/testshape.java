package mirea.shape;

public class testshape
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3, "black");
        System.out.println("Площадь круга = " + circle.getArea());
        System.out.println("Периметр круга = " + circle.getPerimeter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2, 3, 4, "black");
        System.out.println("Площадь треугольника = " + rectangle.getArea());
        System.out.println("Периметр треугольника = " + rectangle.getPerimeter());
        System.out.println();
        Square square = new Square(10, 10, "black");
        System.out.println("Площадь квадрата = " + square.getArea());
        System.out.println("Периметр квадрата = " + square.getPerimeter());
    }
}
