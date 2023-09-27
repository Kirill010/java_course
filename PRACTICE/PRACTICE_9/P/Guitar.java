package P;

public class Guitar implements Priceable {
    private String model;
    private int price;

    Guitar(String name, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Модель гитары: " + model + ", Стоит = " + price + "$");
    }
}
