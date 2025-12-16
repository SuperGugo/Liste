public class Lista {

    private Nodo root;
    private int len = 0;

    public Lista() {
        root = new Nodo();
    }

    public void add( String s ) {
        addTail(s);
    }

    public void remove( String s ) {
        Nodo x = root;
        while (x.getNext() != null) {
            if (x.getNext().getValue().equals(s)) {
                    x.setNext(x.getNext().getNext());
                len--;
                break;
            } 
            x = x.getNext();
        }
    }

    public boolean exists( String s ) {
        Nodo x = root;
        while (x.getNext() != null) {
            x = x.getNext();
            if (x.getValue().equals(s)) return true;
        }
        return false;
    }

    public void addTail(String value) {
        Nodo x = root;
        while (x.getNext() != null) {
            x = x.getNext();
        }
        x.setNext(new Nodo());
        x.getNext().setValue(value);
        len++;
    }

    public void addHead(String value) {
        Nodo x = new Nodo();
        x.setValue(value);
        x.setNext(root.getNext());
        root.setNext(x);
        len++;
    }

    public String get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= len) {
            throw new ArrayIndexOutOfBoundsException("");
        }

        Nodo x = root;
        for (int i = 0; i < index; ++i) {
            x = x.getNext();
        }
        return x.getNext().getValue();
    }

    public void set(String value, int index) throws ArrayIndexOutOfBoundsException {
        if (index >= len) {
            throw new ArrayIndexOutOfBoundsException("");
        }
        Nodo x = root;
        for (int i = 0; i < index; ++i) {
            x = x.getNext();
        }
        x.getNext().setValue(value);
    }

    public int size() {
        return len;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < len; i++) {
            s += (get(i)) + "\n";
        }
        return s;
    }

}
