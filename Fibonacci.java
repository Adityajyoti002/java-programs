public class Fibonacci {
       /* public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }

        public static void main(String[] args) {
            int n = 10;
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
        }
    }**/
       public static void main(String[] args) {


           int a = 0;
           int b = 1;
           int s;
           for (int i = 1; i < 10; i++)
           {
               s = a + b;
               a =  b;
               b = s;
               System.out.println(a);
               System.out.println(b);
               System.out.println(s);
           }

       }
    }
