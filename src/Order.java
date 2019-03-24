import java.util.ArrayList;

public class Order {

    private ArrayList<Pizza> pizzas;

    public Order() {

    }

    public String returnInfo() {
        String output = "";
        for(Pizza pizza: pizzas) {
            output += pizza.returnInfo();
        }
        return output;
    }

    public double returnCost() {
        double cost = 0;
        for(Pizza pizza : pizzas) {
            cost += pizza.calculateCost();
        }
        return cost;
    }

    public int numPizzas() {
        return pizzas.size();
    }

    public void addPizza() {
        Pizza newPizza = new Pizza();
        pizzas.add(newPizza);
    }

    public void setPizzaCrust(int index, Crust newCrust) {
        pizzas.get(index).setCrust(newCrust);
    }
    public Crust getPizzaCrust(int index) {
        return pizzas.get(index).getCrust();
    }

    public void setPizzaSize(int index, Crust

}
