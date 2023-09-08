package mirea.str;

import java.util.*;

public class str
{
    public static void main(String[] args)
    {
        int choice;
        double amount;
        double dollar, euro, von;

        Scanner sc = new Scanner(System.in);

        System.out.println("1: Доллар");
        System.out.println("2: Евро");
        System.out.println("3: Вон");

        System.out.println("Выбери 1 или 2 или 3: ");
        choice = sc.nextInt();

        System.out.println("Введите сумму в рублях числом, которую вы хотите конвертировать?");
        amount = sc.nextFloat();

        if (choice == 1)
        {
            dollar = amount * 0.010212;
            System.out.println(amount + " Rub = " + dollar + " Dollar");
        }
        else if (choice == 2)
        {
            euro = amount * 0.009534;
            System.out.println(amount + " Rub = " + euro + " Euro");
        }
        else if (choice == 3)
        {
            von = amount * 13.62;
            System.out.println(amount + " Rub = " + von + " Von");
        }
        else
        {
            System.out.println("Ошибка");
        }
    }
}
