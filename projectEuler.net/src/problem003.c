#include <stdio.h>
#include <stdbool.h>

/**
* Largest prime factor
* Problem 3
*
* The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143 ?
*/

int main() {
	long number = 600851475143;
	for (long i = 2; i < number; i++)
		if (number % i == 0)
			number = number / i;
	printf("result %lu\n:", number);
	return 0;
}
