package mirea.math_and_random;

import java.util.Scanner;
import java.util.Random;

public class double_array_1
{
    public static void main(String[] args)
    {
        System.out.println("1 способ");
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        double[] random_numbers = new double[num];

        for (int i = 0; i < num; i++)
        {
            random_numbers[i] = Math.random();
        }
        System.out.println("вывел массив со случайными числами");
        for (int i = 0; i < num; i++)
        {
            System.out.println(random_numbers[i]);
        }
        System.out.println();
        System.out.println("процесс сортировки");
        for (int i = 0; i < (num - 1); i++)
        {
            for (int j = 0; j < (num - i - 1); j++)
            {
                if (random_numbers[j] > random_numbers[j + 1])
                {
                    double tmp = random_numbers[j];
                    random_numbers[j] = random_numbers[j + 1];
                    random_numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("вывел массив по возрастанию");
        for (int i = 0; i < num; i++)
        {
            System.out.println(random_numbers[i]);
        }

        System.out.println();

        System.out.println("2 способ");
        System.out.println("Введите число");

        int num1 = in.nextInt();
        Random rand = new Random();

        double[] random_numbers1 = new double[num1];
        for (int i = 0; i < num1; i++)
        {
            double qtty = rand.nextDouble();
            random_numbers1[i] = qtty;
        }

        System.out.println("вывел массив со случайными числами");
        for (int i = 0; i < num1; i++)
        {
            System.out.println(random_numbers1[i]);
        }
        System.out.println();
        System.out.println("процесс сортировки");
        for (int i = 0; i < (num1 - 1); i++)
        {
            for (int j = 0; j < (num1 - i - 1); j++)
            {
                if (random_numbers1[j] > random_numbers1[j + 1])
                {
                    double tmp = random_numbers1[j];
                    random_numbers1[j] = random_numbers1[j + 1];
                    random_numbers1[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("вывел массив по возрастанию");
        for (int i = 0; i < num1; i++)
        {
            System.out.println(random_numbers1[i]);
        }

    }
}
