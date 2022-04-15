package FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore{
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new CheesePizza();
		} else if (type.equals("clam")) {
			return new ClamPizza();
		} else if (type.equals("pepperoni")) {
			return new PepperoniPizza();
		}
		return null;
	}

}
