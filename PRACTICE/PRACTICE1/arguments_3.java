public class arguments_3 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
        for (int i = 1; i <= args.length; i++) 
        {
            System.out.println("Аргумент №" + i + " - " + args[i]);
        }
    }
}
