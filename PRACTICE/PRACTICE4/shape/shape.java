package mirea.shape;
import java.lang.*;

abstract public class shape
{
    public String fig;

    public shape(String fig)
    {
        this.fig = fig;
    }

    public String getType()
    {
        return fig;
    }
}

class Circle extends shape
{
    protected double r;
    private double S;
    private double P;

    public Circle(double r, String fig)
    {
        super(fig);
        this.r = r;
    }

    public double getR()
    {
        return r;
    }

    public double getArea()
    {
        S = Math.PI * r * r;
        return S;
    }

    public double getPerimeter()
    {
        P = 2 * Math.PI * r;
        return P;
    }

    @Override
    public String toString()
    {
        return ("S = " + this.S + " P = " + this.P);
    }
}

class Rectangle extends shape
{
    protected double a, b, c;
    private double S;
    private double P;
    private double p;

    public Rectangle(double a, double b, double c, String fig)
    {
        super(fig);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea()
    {
        P = a + b + c;
        p = P / 2;
        S = Math.sqrt(p * (P - a) * (P - b) * (P - c));
        return S;
    }

    public double getPerimeter()
    {
        P = a + b + c;
        return P;
    }

    @Override
    public String toString()
    {
        return ("S = " + this.S + " P = " + this.P);
    }
}

class Square extends shape
{
    protected double a, b;
    private double S;
    private double P;

    public Square(double a, double b, String fig)
    {
        super(fig);
        this.a = a;
        this.b = b;
    }

    public double getArea()
    {
        S = a * b;
        return S;
    }

    public double getPerimeter()
    {
        P = 2 * (a + b);
        return P;
    }

    @Override
    public String toString()
    {
        return ("S = " + this.S + " P = " + this.P);
    }
}