using System;

namespace Lab4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Введите кол-во эл-ов массива:\t");
            int n = int.Parse(Console.ReadLine());
            int[] mas = new int[n];
            int[] min_mas = new int[n];
            int i, k = 0;
               

            Console.WriteLine("Исходный массив");
            for (i = 0; i < n; i++)
            {
                Console.Write("A[{0}]= ", i + 1);
                mas[i] = int.Parse(Console.ReadLine());
            }

            for (i = 1; i < n - 1; i++)
            {
                if ((mas[i] < mas[i - 1]) && (mas[i] < mas[i + 1]))
                {
                    Console.WriteLine($"Локальный минимум[{k+1}] = {mas[i]}");
                    k++;
                }
                if (k == 0) {
                    Console.Write("Локальных минимумов не найдено.");
                };
            }

            
           
        }
    }
}
