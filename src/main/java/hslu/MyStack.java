package hslu;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack {

    private int stackSize = 10;
    private int emptyIndex = -1;
    private int index;
    private Element[] myAwesomeStack;
    private Element dummyElement = new Element(-1231231);

    public MyStack() {
        this.index = -1;
        this.myAwesomeStack = new Element[10];
    }

    public void push(Element element) {
        if (this.index + 1 < this.stackSize) {
            this.index++;
            this.myAwesomeStack[index] = element;
        } else {
            System.out.println("ERROR - push: stack full! Cannot add ");
            System.out.println(element.toString());
        }
    }

    public Element top() throws NoSuchElementException {
        if (this.index > this.emptyIndex) {
            return this.myAwesomeStack[index];
        } else {
            System.out.println("ERROR - top: stack is empty");
            return this.dummyElement;
        }
    }

    public void pop() {
        if (this.index > this.emptyIndex) {
            this.index--;
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public void print() {
        if (this.index < 0) {
            System.out.println("This Stack is empty!");
        } else {
            System.out.println("Stack contains:");
            for (int i = index; i >= 0; i--) {
                System.out.println(this.myAwesomeStack[i].getValue());
            }
            System.out.println("top element is: " + this.myAwesomeStack[index].getValue());
        }
    }

}
