import java.util.Scanner;

public class factorial_5
{
    private static long factorial(long num)
    {
        long prod = 1;
        for (int i = 1; i <= num; i++)
        {
            prod *= i;
        }
        return prod;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        System.out.println(factorial(num));
    }
}
