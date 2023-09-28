package furnitures;

public abstract class Furniture {
    private String name;
    private String material;
    public Furniture(String name, String material){
        this.name = name;
        this.material = material;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Мебель: " + name + ", Материал: " + material;
    }
}

class Type extends Furniture {
    private String type;

    public Type(String name, String material, String type) {
        super(name, material);
        this.type = type;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Стоит на " + type;
    }
}