#include <stdio.h>
#include <stdlib.h>

/**
 * Large sum
 * Problem 13
 *
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers from problem013.txt.
 */

int getRemain(int *number) {
    if (*number == *number % 10)
        return 0;
    else
        *number = *number % 10;
    return 1;
}

int main() {
    int digit = 50, line = digit + 2, count = 100, temp = 0, remain = 0;
    char string[line];

    size_t size = digit;
    do
        size++;
    while ((count = count / 10) > 1);
    char result[size];
    for (int i = 0; i < size; result[i++] = '0');
    result[size] = '\0';

    FILE *in = fopen("data/problem013.txt", "r");
    while ((fgets(string, line, in)) != NULL) {
        for (int i = digit - 1, j = size - 1; j >= 0; i--, j--) {
            temp = result[j] - '0' + remain;
            if (i >= 0)
                temp += (string[i] - '0'); 
            remain = getRemain(&temp);
            result[j] = temp + '0';
        }
    }
    printf("result: ");
    for(int i = 0; i < 10; printf("%c", result[i++]));
    printf("\n");
    return 0;
}
