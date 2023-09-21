package human;

public class Head {
    private boolean hurt;

    public Head(boolean hurt) {
        this.hurt = hurt;
    }

    public boolean get_hurt() {
        return this.hurt;
    }

    public void set_hurt(boolean hurt) {
        this.hurt = hurt;
    }

    public void h(boolean hurt) {
        if (hurt) {
            System.out.println("Голова болит");
        }
        else {
            System.out.println("Голова не болит");
        }
    }
}
