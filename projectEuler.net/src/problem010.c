#include <stdio.h>
#include <stdbool.h>

/**
 * Summation of primes
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

double _abs(double diff) {
    if (diff < 0)
        return diff * (-1);
    return diff;
}

double _sqrt(int number) {
    double dx1 = (number * 1.0) / 2;
    double dx2 = (dx1 + (number / dx1)) / 2;
    while (_abs(dx2 - dx1) >= 0.01) {
        dx1 = dx2;
        dx2 = (dx1 + (number / dx1)) / 2;
    }
    return dx2;   
}

bool isPrime(int number) {
    double sqrt_of_number = _sqrt(number);
    int whole = (int) sqrt_of_number;
    if (sqrt_of_number - whole == 0.0)
        return false;
    for (int i = 2; i < sqrt_of_number; i++)
        if (number % i == 0)
            return false;
    return true;
}

int main() {
    long sum = 0;
    for (int i = 2; i < 2000000; i++)
        if (isPrime(i))
            sum += i;
    printf("result: %lu\n", sum);
    return 0;
}
