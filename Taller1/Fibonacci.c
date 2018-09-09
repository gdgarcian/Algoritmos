#include <stdio.h>

unsigned int fibonacciInt(unsigned int n) {

    if (n <= 1) 
        return 1;

    unsigned int fib = 1;
    unsigned int prevFib = 1;

    for (unsigned int i = 2; i < n; i++) {

        unsigned int temp = fib;
        fib += prevFib;
        prevFib = temp;

    }

    return fib;

}

unsigned long int fibonacciLongInt(unsigned long int n) {

    if (n <= 1) 
        return 1;

    unsigned long int fib = 1;
    unsigned long int prevFib = 1;

    for (unsigned long int i = 2; i < n; i++) {

        unsigned long int temp = fib;
        fib += prevFib;
        prevFib = temp;

    }

    return fib;

}


unsigned long long int fibonacciLongLongInt(unsigned long long int n) {

    if (n <= 1) 
        return 1;

    unsigned long long int fib = 1;
    unsigned long long int prevFib = 1;

    for (unsigned long long int i = 2; i < n; i++) {

        unsigned long long int temp = fib;
        fib += prevFib;
        prevFib = temp;

    }

    return fib;

}

void main () {

    //unsigned int number;
    //unsigned int long number;
    //unsigned int long long number;


    //number = fibonacciInt(8);
    //number = fibonacciLongInt(8);

    //printf("%u\n", number);
    //printf("%lu\n", number);
    //printf("%llu\n", number);

    
}
