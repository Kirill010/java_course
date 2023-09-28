package P;

public class Test {
    public static void main(String[] args) {
        Priceable printable = new Guitar("Gibson Les Paul", 5000);
        printable.print();
        printable = new Home(100000);
        printable.print();
    }
}
