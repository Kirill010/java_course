package N;

public class Planet implements Nameable{
    private String name;
    Planet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(){
        System.out.println("Название планеты: " + name);
    }
}
