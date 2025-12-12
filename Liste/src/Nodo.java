public class Nodo {

    private String value;
    private Nodo next;

    public Nodo() {
    }

    public Nodo getNext() {
        return next;
    }

    public String getValue() {
        return value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
