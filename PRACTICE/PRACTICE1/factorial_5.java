package ru.mirea.lab1;

import java.util.Scanner;

public class factorial_5
{

    public static void main(String[] args)
    {
        while (true){
            Scanner in = new Scanner(System.in);
            long num = in.nextInt();
            if (num < 0)
            {
                System.out.println("Введи число больше 0!");
            }
            if (num > 21)
            {
                System.out.println("Введи другое меньше 21!");
            }
            else {
                long prod = 1;
                for (int i = 1; i <= num; i++)
                {
                    prod *= i;
                }
                System.out.println(prod);
            }
        }
    }
}
