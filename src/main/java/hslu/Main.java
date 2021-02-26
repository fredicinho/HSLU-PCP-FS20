package hslu;

public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.print();
        myStack.top();
        myStack.push(new Element(42));
        myStack.push(new Element(72));
        myStack.push(new Element(31));
        Element e = myStack.top();
        System.out.println("top Element is " + e.getValue());
        myStack.push(new Element(54));
        myStack.print();
    }

}
