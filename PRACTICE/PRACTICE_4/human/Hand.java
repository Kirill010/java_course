package human;

public class Hand {
    private boolean clap;
    public Hand(boolean clap) {
        this.clap = clap;
    }

    public boolean get_clap() {
        return this.clap;
    }

    public void set_clap(boolean clap) {
        this.clap = clap;
    }

    public void c(boolean clap) {
        if (clap) {
            System.out.println("Стоим на руках!");
        }
        else {
            System.out.println("Руки ничего не делают");
        }
    }
}

