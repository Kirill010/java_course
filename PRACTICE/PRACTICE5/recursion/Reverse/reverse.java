package mirea.recursion.Reverse;

public class reverse
{
    public static int rev(int n, int a)
    {
        if (n == 0) {
            return a;
        }
        else {
            return rev(n / 10, 10 * a + n % 10);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(rev(123, 0));
    }
}
