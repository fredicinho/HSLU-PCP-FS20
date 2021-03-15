package SW01.Uebung3;


public class Stack implements ADTStack {

    private Element topElement;
    private Element firstElement;
    private int elementsInStack;

    public Stack() {
        this.elementsInStack = 0;
    }

    public void push(Element element) {
        this.elementsInStack++;
        if (this.firstElement == null) {
            this.firstElement = element;
        } else {
            this.topElement.setNext(element);
        }
        this.topElement = element;
    }

    public Element top() {
        if (this.topElement == null) {
            System.out.println("top: Stack is empty");
            return new Element(-123213123);
        }
        return this.topElement;
    }

    public boolean pop() {
        if (this.topElement == null) {
            System.out.println("pop: Stack is empty");
            return false;
        }

        Element elementBeforeTop = this.firstElement;
        while (!elementBeforeTop.getNext().equals(this.topElement)) {
            elementBeforeTop = elementBeforeTop.getNext();
        }
        elementBeforeTop.setNext(null);
        this.topElement = elementBeforeTop;
        this.elementsInStack--;
        return true;
    }

    public void print() {
        if (this.elementsInStack == 0) {
            System.out.println("print: Stack is empty!");
        } else {
            System.out.println("Stack contains: ");
            Element element = this.firstElement;
            for (int i = 1; i <= this.elementsInStack; i++) {
                System.out.println(element.getValue());
                element = element.getNext();
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.elementsInStack == 0;
    }

    @Override
    public int size() {
        return this.elementsInStack;
    }
}
