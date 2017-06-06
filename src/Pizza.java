import java.util.ArrayList;

/**
 * Created by Anatoliy on 06.06.2017.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough..." + dough);
        System.out.println("adding sauce..." + sauce);
        System.out.println("adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
