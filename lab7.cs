//lab7 Ilushchenko Artem[13] PD-22
using System;
using System.Collections.Generic;

namespace lab7
{
    class Program
    {
        static void Main(string[] args)
        {
            List<char> listchar = new List<char>();
            Console.Write("Введите количество листа: ");
            int size = int.Parse(Console.ReadLine());
            for (int i = 0; i < size; i++)
            {
                Console.Write($"Введите {i + 1} елемент листа: ");
                listchar.Add(char.Parse(Console.ReadLine()));
            }
            Console.Write("Введите проверочною переменную: ");
            var q = char.Parse(Console.ReadLine());
            Console.Write("Индекс похожего елемента: ");
            bool t = false;
            for (int i = 0; i < size; i++)
            {
                if (listchar[i] == q)
                {
                    Console.Write("{0 } ", i);
                    t = true;
                }
            }
            if (!t)
                Console.Write("Таких елементов нет");
            var ArrFrList = new char[size];
            for (int i = 0; i < size; i++)
                ArrFrList[i] = listchar[i];
            Console.WriteLine();
            Console.Write("Масив по листу: ");
            for (int i = 0; i < size; i++)
                Console.Write($"{ArrFrList[i]} ");
            Console.WriteLine();
            Console.ReadLine();
        }
    }
}