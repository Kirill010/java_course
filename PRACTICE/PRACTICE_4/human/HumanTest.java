package human;

public class HumanTest {
    public static void main(String[] args){
        Human human = new Human("Кирилл", 18);
        human.set_age(19);
        System.out.println(human);

        Head head = new Head(false);
        head.h(false);

        Hand hand = new Hand(true);
        hand.c(false);

        Leg leg = new Leg(true);
        leg.k(true);
    }
}
