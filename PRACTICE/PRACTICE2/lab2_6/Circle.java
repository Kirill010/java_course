package mirea.lab2_5;
import java.lang.*;

public class Circle
{
    private int rad;
    private double s;
    private double c;

    public Circle(int rad)
    {
        this.rad = rad;
    }

    public int get_Rad()
    {
        return rad;
    }

    public double S(int rad)
    {
        this.rad = rad;
        this.s = Math.PI * rad * rad;
        return s;
    }

    public double C(int rad)
    {
        this.rad = rad;
        this.c = 2 * Math.PI * rad;
        return c;
    }


    @Override
    public String toString()
    {
        return "Площадь = " + this.s + "; Длина окружности = " + this.c;
    }
}
