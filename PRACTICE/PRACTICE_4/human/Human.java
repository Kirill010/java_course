package human;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String get_name() {
        return this.name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public int get_age() {
        return this.age;
    }

    public void set_age(int age) {
        if (0 < age && age < 100) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Имя человека: " + this.name + ", Возраст: " + this.age;
    }
}
