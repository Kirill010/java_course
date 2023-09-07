package mirea.lab2_5;

public class TestCircle {
    public static void main(String[] args)
    {
        int num = 5;
        Circle circle = new Circle (num);
        circle.S(num);
        circle.C(num);
        System.out.println(circle.toString());
    }
}
