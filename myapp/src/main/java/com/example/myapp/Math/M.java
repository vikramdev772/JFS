package com.example.myapp.Math;

public class M {

    public long f(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public long sum(int n) {
        int a = 0;
        for (int i = 0; i <= n; i++) {
            a = a + i;
        }
        return a;
    }
// Return Fibonacci series up to n terms
    public long[] fibonacciSeries(int n) {
        long[] fib = new long[n];

        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }

}


