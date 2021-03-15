//
// Created by Frederico on 26.02.21.
//

#include <printf.h>
#include<stdio.h>




void printNumbersGoto(int n) {
    int startNumber = 0;
    start:
    if (startNumber > n) return;
    printf("%i ",startNumber);
    startNumber++;
    goto start;
}

void printNumbersFor(int n) {
    for (int i = 0; i <= n; ++i) {
        printf("%i ", i);
    }
}

void printRecursive(int n, int m) {
    if (n > m) return;
    printf("%i ", n);
    printRecursive(n + 1, m);
}


void printNumbersRecursiveFunction(int n) {
    printRecursive(0, n);
}






void main() {
    printNumbersGoto(10); printf(" = printNumbersGoto \n");
    printNumbersFor(10); printf(" = printNumbersFor \n");
    printNumbersRecursiveFunction(10); printf(" = printNumbersRecursiveFunction");

}
