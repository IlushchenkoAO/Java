using System;

namespace LAB1_Var13
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Console.WriteLine("Обчислення периметру заданого n-кутника, описаного навколо кола радиусом R:");
            Console.Write("Кол-во сторон:");
            int n = Convert.ToInt32(Console.ReadLine());
            Console.Write("Радиус круга:");
            double r = Convert.ToDouble(Console.ReadLine());
            double P = n * (2 * r * Math.Sqrt(3));
            Console.WriteLine($"Периметер {n}-угольника равен: {P}");
        }
    }
}
