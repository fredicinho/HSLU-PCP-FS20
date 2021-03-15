package SW01.Uebung3;

public interface ADTStack {
    public void push(Element e);
    public Element top();
    public boolean pop();
    public void print();
    public boolean isEmpty();
    public int size();
}
