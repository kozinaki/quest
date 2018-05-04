#include <stdio.h>
#include <stdbool.h>

double abs_m(double diff) {
    if(diff < 0)
        return diff * (-1);
    return diff;
}

double sqrt_m(int num) {
    double x1 = (num * 1.0) / 2;
    double x2 = (x1 + (num / x1)) / 2;
    while(abs_m(x1 - x2) >= 0.0000001) {
        x1 = x2;
        x2 = (x1 + (num / x1)) / 2;
    }
    return x2;
}

bool isPrime(int number) {
    double sqrt_of_number = sqrt_m(number);
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
