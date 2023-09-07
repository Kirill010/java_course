package ru.mirea.lab1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class while_2
{
    public static void main(String[] args)
    {
        System.out.println("Решаем через while");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        var arr = new ArrayList<Integer>(num);

        boolean logic = true;

        while (logic)
        {
            int i = in.nextInt();;
            arr.add(i);
            if (arr.size() == num)
            {
                break;
            }
        }

        int min = Collections.min(arr);
        int max = Collections.max(arr);

        System.out.println(min);
        System.out.println(max);

        System.out.println("Решаем через do-while");

        int num1 = in.nextInt();

        var arr1 = new ArrayList<Integer>(num1);

        do
        {
            int i = in.nextInt();;
            arr.add(i);
            num1--;
        }while (num1 != 0);

        int min1 = Collections.min(arr);
        int max1 = Collections.max(arr);

        System.out.println(min1);
        System.out.println(max1);

    }
}
