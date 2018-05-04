#include <stdio.h>
#include <stdbool.h>

/**
* 10001st prime
* Problem 7
*
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10 001st prime number?
*/

double _abs(double diff) {
    if(diff < 0)
        return diff * (-1);
    return diff;
}

double _sqrt(int number) {
    double dx1 = (number * 1.0) / 2;
    double dx2 = (dx1 + (number / dx1)) / 2;
    while(_abs(dx1 - dx2) >= 0.01) {
        dx1 = dx2;
        dx2 = (dx1 + (number / dx1)) / 2;
    }
    return dx2;
}

bool isPrime(int number) {
    double sqrt_of_number = _sqrt(number);
    int whole = (int) sqrt_of_number;
    if ((sqrt_of_number - whole) == 0.0)
        return false;
    for (int i = 2; i < sqrt_of_number; i++)
        if (number % i == 0)
            return false;
    return true;
}

int main() {
    int prime = 1, i = 0;
    while (i < 10001) {
        prime++;
        if (isPrime(prime))
            i++;
    }
    printf("result: %i\n", prime);
}
