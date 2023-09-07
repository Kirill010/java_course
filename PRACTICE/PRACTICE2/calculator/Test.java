package mirea.calculator;

public class Test
{
    public static void main(String[] args)
    {
        int a = 4, b = 3;
        char s = '+';
        Arifmetics Calc = new Arifmetics(a, s, b);
        Calc.f(a, s, b);
        System.out.println(Calc.toString());
    }
}
