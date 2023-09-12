package mirea.seasons;

public class testseasons
{
    public static void main(String[] args)
    {
        seasons season = seasons.Summer;
        System.out.println(season);
        print(seasons.Spring);
        printall();
    }

    public static void print(seasons cur)
    {
        switch (cur)
        {
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void printall()
    {
        for (seasons s : seasons.values())
        {
            System.out.println(s + " " + s.gettemp() + " " + s.getDescription());
        }
    }
}
