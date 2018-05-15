#include <stdio.h>

long factories(long triangle) {
    //printf("%i --- ", triangle);
    long divider = 1, count = 0;
    while (triangle >= divider) {
        if (triangle % divider == 0) {
     //       printf("%i %i | ", divider, triangle);
            count++;
        }
        divider++;
    }
   // printf(" %i\n", count);
    return count;
}

int main() {
    long factor = 1, triangle = 0;
    long count = 0;
    while((count = factories(triangle)) <= 500) {
        //printf(" - %i, %i\n", count, triangle);
        triangle += factor++;
    }
    printf("%lu\n", triangle);
    return 0;
}
