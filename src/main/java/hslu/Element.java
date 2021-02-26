package hslu;

public class Element {

    private int myElement;

    Element(int myElement){
        this.myElement = myElement;
    }

    public int getValue() {
        return this.myElement;
    }

    @Override
    public String toString() {
        return String.valueOf(this.myElement);
    }
}
