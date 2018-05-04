#include <stdio.h>

/**
 * Even Fibonacci numbers
 * Problem 2
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

/**
 * Unconditional
 */
int advanced() {
    int last = 0;
    int current = 2;
    int sum = 0;
    while(current < 4000000) {
        sum += current;
        current = current * 4 + last;
        last = (current - last) / 4;
    }
    return sum;
}

/**
 * Conditional
 */
int standard() {
    int last = 1;
    int current = 2;
    int sum = 0;
    while(current < 4000000) {
        if(current % 2 == 0)
            sum += current;
        current = last + current;
        last = current - last;
    }
    return sum;
}

int main() {
    printf("advanced result: %i\n", advanced());
    printf("standard result: %i\n", standard());
    return 0;
}
