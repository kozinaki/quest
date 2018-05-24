#include <stdio.h>
#include <stdlib.h>

#define DIGIT 50
#define COUNT 100
#define LINE DIGIT + 2

int getRemain(int *number) {
    if (*number == *number % 10)
        return 0;
    else
        *number = *number % 10;
    return 1;
}

int main() {
    int result = 0, temp = 0, remain = 0;
    char string[LINE];
    size_t size = DIGIT * COUNT;
    char sum[size];
    for(int i = 0; i < size; sum[i++] = '0');
    //printf("%s", sum);
    FILE *in = fopen("problem013.txt", "r");
    while ((fgets(string, LINE, in)) != NULL) {
        for (int i = DIGIT - 1, j = size - 1; j > -1; i--, j--) {
            if (i > -1)
                temp = (sum[j] - '0') + (string[i] - '0'); 
            else
                temp = 0;
            temp += remain;
            printf("%i, %i, %i, %i, %i\n", i, j, sum[j] - '0', string[i] - '0', temp);
            remain = getRemain(&temp);
            sum[j] = temp + '0';
        }
    }
    /*fgets(string, LINE, in);
    char t[] = "000";
    printf("%i\n", t[0] - '0');
    printf("%s\n", string);
    printf("%i\n", string[DIGIT - 2] - '0');*/
    printf("%s", sum);

    //printf("result: %i\n", result);
    return 0;
}
