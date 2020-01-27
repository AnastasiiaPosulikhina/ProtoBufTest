using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task1FromVadim
{
    class Program
    {
        static void Main(string[] args)
        {
            using (StreamWriter sw = new StreamWriter(@"C:\Users\Nastya\VadimTasks\Message.txt", false))
            {
                sw.Write("Hello Vadimushka!");
            }
        }
    }
}
