/**
 * Created by Anatoliy on 07.06.2017.
 */
public abstract class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type) {

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
