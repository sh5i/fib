package fib;

public class App {
    private static int fibi(int n, int a, int b) {
        if (n == 0) {
            return b;
        } else {
            return fibi(n - 1, b, a + b);
        }
    }

    private static int fib(int n) {
        return fibi(n, 1, 0);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fib(n));
    }
}
