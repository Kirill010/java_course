package human;

public class Leg {
    private boolean kick;
    public Leg(boolean kick) {
        this.kick = kick;
    }

    public boolean get_kick() {
        return this.kick;
    }

    public void set_kick(boolean kick) {
        this.kick = kick;
    }

    public void k(boolean kick) {
        if (kick) {
            System.out.println("Ногой стучим ритм!");
        }
        else {
            System.out.println("Ноги ничего не делают");
        }
    }
}
