package mirea.calculator;

public class Arifmetics
{
    private int answer;
    private int a;
    private int b;
    private char s;

    public Arifmetics(int a, char s, int b)
    {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public double f(int a, char s, int b)
    {
        if (s == '+')
        {
            answer = a + b;
        }
        else if (s == '-')
        {
            answer = a - b;
        }
        else if (s == '*')
        {
            answer = a * b;
        }
        else if (s == '%')
        {
            answer = a % b;
        }

        return answer;
    }

    @Override
    public String toString()
    {
        return "Ответ = " + this.answer;
    }
}
