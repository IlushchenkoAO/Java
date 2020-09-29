using System;

namespace ConsoleApplication7
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Введите размер квадратной матрицы ");
            int n = Convert.ToInt32(Console.ReadLine());
            while (n <= 0)
            {
                Console.WriteLine("неверный размер!");
                n = Convert.ToInt32(Console.ReadLine());
            }
            int[,] mass = new int[n, n];
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    Console.WriteLine("Введите [0]-ую строку, [1]-й элемент", i + 1, j + 1);
                    mass[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }
            Console.WriteLine("Массив:");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    Console.Write("{0}\t", mass[i, j]);

                }
                Console.WriteLine();
            }
            int s = 0;
            for (int i = 0; i < n; i++)
                s += mass[i, i];
            Console.WriteLine("Сумма главной диагонали равна {0}", s);
            Console.ReadLine();

            
        }
    }
}