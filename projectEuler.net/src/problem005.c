#include <stdio.h>
#include <stdlib.h>

/**
* Smallest multiple
* Problem 5
*
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

int RANGE = 20;
int *p_primeFactors, *p_tempPrimeFactors;

/**
* Initialization arrays
*/
void initArrays() {
	p_primeFactors = malloc(sizeof(int) * (RANGE));
	p_tempPrimeFactors = malloc(sizeof(int) * (RANGE));
	for (int l = 0; l < RANGE; l++) {
		p_primeFactors[l] = 0;
		p_tempPrimeFactors[l] = 0;
	}
}

void finalize() {
	free(p_primeFactors);
	free(p_tempPrimeFactors);
}

/**
* Prime factorization and distribution of factors on array
*/
void factoring(int number) {
	int factor = 2;
	do {
		if (number % factor == 0)  {
			number /= factor;
			p_tempPrimeFactors[factor]++;
		} else 
			factor++;
	} while (number > 1);
	for (int h = 0; h < RANGE; h++) {
		if(p_tempPrimeFactors[h] > p_primeFactors[h])
			p_primeFactors[h] += p_tempPrimeFactors[h] - p_primeFactors[h];
		p_tempPrimeFactors[h] = 0;
	}
}

/**
* Exponentiation
*/
int expo(int number, int e) {
	for (int f = e, exp = number; f > 1; f--)
		number *= exp;
	return number;
}

int main() {
	++RANGE;
	int lcm = 1;
	initArrays();
	for (int i = 2; i < RANGE; i++)
		factoring(i);
	for (int k = 0; k < RANGE; k++)
		if(p_primeFactors[k] > 0 )
			lcm *= expo(k, p_primeFactors[k]);
	printf("result: %i\n", lcm);
	finalize();
}
