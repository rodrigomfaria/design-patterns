package FactoryMethod;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Pizza Sauce";
		
		toppings.add("Greated Reggiano Cheese");
	}
}