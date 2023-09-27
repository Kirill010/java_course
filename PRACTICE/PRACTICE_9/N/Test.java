package N;

public class Test {
    public static void main(String[] args) {
        Nameable printable = new Planet("Земля");
        printable.print();
        printable = new Cars("Lexus", "Black");
        printable.print();
    }
}
