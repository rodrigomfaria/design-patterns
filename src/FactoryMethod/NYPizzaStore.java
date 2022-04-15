package FactoryMethod;

public class NYPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("clam")) {
			return new ClamPizza();
		} else if (type.equals("pepperoni")) {
			return new PepperoniPizza();
		}
		return null;
	}
}
