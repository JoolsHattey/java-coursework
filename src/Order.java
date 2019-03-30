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
        Pizza newPizza = new Pizza(getPizzas().size());
        pizzas.add(newPizza);
    }

    public void deletePizza(int id) {
        this.pizzas.remove(id);
    }

    public void editPizza(int id) {

    }

    public ArrayList<Pizza> getPizzas() {
        return this.pizzas;
    }

    public void setPizzaCrust(int id, Crust newCrust) {
        pizzas.get(id).setCrust(newCrust);
    }
    public Crust getPizzaCrust(int id) {
        return pizzas.get(id).getCrust();
    }

    public void setPizzaSize(int id, Size newSize) {
        pizzas.get(id).setSize(newSize);
    }
    public Size getPizzaSize(int id) {
        return pizzas.get(id).getSize();
    }
    
    public void getPizzaSauce(int id, Sauce newSauce) {
        pizzas.get(id).setSauce(newSauce);
    }
    public Sauce getPizzaSauce(int id) {
        return pizzas.get(id).getSauce();
    }
    
    public void setPizzaTopping1(int id, Topping newTopping) {
        pizzas.get(id).setTopping1(newTopping);
    }
    public Topping getPizzaTopping1(int id) {
        return pizzas.get(id).getTopping1();
    }

    public void setPizzaTopping2(int id, Topping newTopping) {
        pizzas.get(id).setTopping2(newTopping);
    }
    public Topping getPizzaTopping2(int id) {
        return pizzas.get(id).getTopping2();
    }

}
