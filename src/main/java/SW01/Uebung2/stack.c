/*
 * Stack implementation based on a array.
 * 
 * Author: ruedi.arnold@hslu.ch
 */

#include <stdio.h>
#include <stdlib.h>
#include "stack.h"

/**
 * Creates a new Stack, sets the index to -1 because it is empty and returns the struct (Stack)
 * @return
 */
stack init() {
    stack s;
    s.index = STACK_EMPTY_INDEX;
    return s;
}

/**
 * Pushed the Element e to the Stack s if the stack is not full!
 * @param e
 * @param s
 * @return
 */
stack push(element e, stack s) {
    if (s.index + 1 < STACK_SIZE) {
        // there is space for one more element
        s.index++;
        s.stackArray[s.index] = e;
    } else {
        printf("ERROR - push: stack full! Cannot add %i\n", e);
    }
    return s;
}

/**
 * Returns the Top Element in the Stack. If the stack is empty, it returns a dummy element!
 * @param s
 * @return
 */
element top(stack s) {
    if (s.index > STACK_EMPTY_INDEX) {
        return s.stackArray[s.index];
    } else {
        printf("ERROR - top: stack empty!\n");
        return STACK_DUMMY_ELEMENT;
    }
}

/**
 * Just decrements the index of the stack!
 * @param s
 * @return
 */
stack pop(stack s) {
    if (s.index > STACK_EMPTY_INDEX) {
        s.index--;
    }
    return s;
}

/**
 * prints all elements in the stack!
 * @param s
 */
void print(stack s) {
    if (s.index > STACK_EMPTY_INDEX) {
        printf("print - Stack contains: ");
        int i;
        for (i = 0; i <= s.index; i++) {
            printf("%i, ", s.stackArray[i]);
        }
        printf("top element = %i\n", s.stackArray[s.index]);
    } else {
        printf("print - Stack is empty\n");
    }
}

int isEmpty(stack s) {
    return s.index == STACK_EMPTY_INDEX;
}

int size(stack s) {
    return s.index + 1;
}
