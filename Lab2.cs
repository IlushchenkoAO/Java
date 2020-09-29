using System;

namespace Lab2
{
    class Program
    {
        static void Main(string[] args)
        {
            int nn, nk;
            do
            {
                Console.Write("Введите nn: ");
                nn = Convert.ToInt32(Console.ReadLine());
            } while (nn < 0);
            do
            {
                Console.Write("Введите nk: ");
                nk = Convert.ToInt32(Console.ReadLine());
            } while (nk < nn);

            double result = 1;

            for (int k = nn; k <= nk; k++)
            {
                result = result * (Convert.ToInt32(Math.Pow((-1), k) * (Math.Pow(k, 2) + (Math.Pow((-1), k*k+1) * k ) / (Math.Pow(2*k, 3) + 3 ))));
            }

            Console.WriteLine("Result = {0}", result);
        }
    }
}
