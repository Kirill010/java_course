package furnitures;

public class TestFurniture {
    public static void main(String[] args){
        Furniture f1 = new Type("Игровое кресло", "Экокожа", "колёсиках");
        System.out.println(f1.toString());
        System.out.println();
        Furniture f2 = new Type("Стул", "Деревянный", "ножках");
        System.out.println(f2.toString());
        System.out.println();
        FurnitureShop furniture_shop = new FurnitureShop();
        furniture_shop.add_furniture(f1);
        furniture_shop.add_furniture(f2);
        System.out.println(furniture_shop);
    }
}
