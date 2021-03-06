#include <stdio.h>

/**
 * Largest palindrome product
 * Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

int countOfDigits(int number) {
    int count = 0;
    while (number != 0) {
        count++;
        number /= 10;
    }
    return count;
}

int tensDegree(int degree) {
    int tens = 1;
    while (degree > 0) {
        tens *= 10;
        degree--;
    }
    return tens;
}

int main() {
    int product = 0, result = 0, digits = 0, maxProduct = 0;
    int bottomBorder = 899;
    for (int i = 999, j = i; i > bottomBorder; j--) {
        product = i * j;
        digits = countOfDigits(product);
        for (int k = 1; k <= digits; k++)
            result += ((product % tensDegree(k) / tensDegree(k - 1)) * tensDegree(digits - k));
        if (result == product && maxProduct < result)
            maxProduct = result;
        if (i == (bottomBorder + 1) && maxProduct == 0)
            bottomBorder -= 100;
        if (j == (bottomBorder + 1))
            j = i--;
        result = 0;
    }

    printf("result: %i\n", maxProduct);
    return 0;
}
