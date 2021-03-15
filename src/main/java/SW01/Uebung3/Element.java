package SW01.Uebung3;

import java.util.Objects;

public class Element {

    private Element nextElement = null;
    private int value;

    Element(int value){
        this.value = value;
    }


    public int getValue() {
        return this.value;
    }

    public Element getNext() {
        return this.nextElement;
    }

    public void setNext(Element next) {
        this.nextElement = next;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return value == element.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextElement, value);
    }
}
