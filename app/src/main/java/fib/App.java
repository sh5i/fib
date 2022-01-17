package fib;

public class App {
    private static int fib(int n) {
        int x = 0, y = 1, a = 1, b = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                int t = x;
                x = x * x + y * y;
                y = t * y + y * (t + y);
                n = n / 2;
            } else {
                int t = a;
                a = a * x + b * y;
                b = t * y + b * (x + y);
                n = n - 1;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fib(n));
    }
}
