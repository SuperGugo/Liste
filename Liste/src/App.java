public class App {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.addHead("mario");
        l.addHead("giulio");
        l.addHead("francesco");
        l.remove("giulio");
        
        System.out.println(l);
        System.out.println(l.exists("francesco"));
    }
}
