using System;

namespace Lab2
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Введите трехзначное число:");
            int number;
            do
            {
                number = Convert.ToInt32(Console.ReadLine());
            } while (number < 99 || number > 999);


            int a = number / 100;
            int b = (number % 100) / 10;
            int c = number % 10;

            if (a < b && b < c)
            {
                Console.WriteLine($"Числа {a} {b} {c} создают возрастающую последовательность");
            }
            else {
                Console.WriteLine($"Числа {a} {b} {c} НЕ создают возрастающую последовательность");
            };
        }
    }
}
