package N;

public class Cars implements Nameable{
    private String model;
    private String color;
    Cars(String model, String color){
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return model;
    }
    public String getColor() {
        return color;
    }

    public void print(){
        System.out.println("Модель машины: " + model + ", Цвет: " + color);
    }
}