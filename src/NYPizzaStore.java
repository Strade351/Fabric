/**
 * Created by Anatoliy on 07.06.2017.
 */
public class NYPizzaStore extends PizzaStore {
    Pizza pizza = null;
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperonni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
