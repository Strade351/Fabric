/**
 * Created by Anatoliy on 07.06.2017.
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza = null;
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperonni")) {
            pizza = new ChicagoStylePeppreoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
