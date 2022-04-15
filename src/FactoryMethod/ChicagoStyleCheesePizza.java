package FactoryMethod;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Tick Crust Dough";
		sauce = "Plun Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
}