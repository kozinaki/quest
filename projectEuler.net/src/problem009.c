#include <stdio.h>

/**
 * Special Pythagorean triplet
 * Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

int SUM = 1000;

int main() {
    int m = 3, n = 2, a = 1, b = 1, c = 1, total = 1;
    for (; total != SUM; m++) {
        a = m * m - n * n;
        b = 2 * m * n;
        c = m * m + n * n;

        total = a + b + c;

        if (total > SUM)
            m = ++n;
    }
    printf("result: %i\n", a * b * c);
    return 0;
}
