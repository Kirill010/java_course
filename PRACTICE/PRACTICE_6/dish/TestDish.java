package dish;

public class TestDish {
    public static void main(String[] args){
        Dish dish = new Plate("Тарелка", "Керамика", "Белый");
        dish.name();
        Dish fork = new Tableware("Тарелка", "Металл", "Вилка");
        fork.name();
    }
}
