public class merge_sort
{
    public static void main(String[] args)
    {
        int[] num1  = new int[] {1, 4, 10, 11};
        int[] num2  = new int[] {2, 3, 3, 4, 8};
        int[] num3 = new int[num1.length + num2.length];
        int i = 0, j = 0;
        for (int k = 0; k < num3.length; k++)
        {
            if (i > num1.length-1)
            {
                int a = num2[j];
                num3[k] = a;
                j++;
            }
            else if (j > num2.length-1)
            {
                int a = num1[i];
                num3[k] = a;
                i++;
            }
            else if (num1[i] < num2[j])
            {
                int a = num1[i];
                num3[k] = a;
                i++;
            }
            else
            {
                int b = num2[j];
                num3[k] = b;
                j++;
            }
        }

        for (int l = 0; l < num3.length; l++)
        {
            System.out.print(num3[l] + " ");
        }
    }
}
