package JavaCourseworkUP894547;

import java.util.ArrayList;

public class Order {

    private ArrayList<Pizza> pizzas;
    private int selectedPizza;

    public Order() {
        pizzas = new ArrayList<Pizza>();
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

    public void selectPizza(int id) {
        this.selectedPizza = id;
    }

    public void deletePizza() {
        this.pizzas.remove(getSelectedPizza());
    }



    public ArrayList<Pizza> getPizzas() {
        return this.pizzas;
    }

    public int getSelectedPizza() {
        return this.selectedPizza;
    }

    public void setPizzaCrust(Crust newCrust) {
        pizzas.get(getSelectedPizza()).setCrust(newCrust);
    }
    public Crust getPizzaCrust() {
        return pizzas.get(getSelectedPizza()).getCrust();
    }

    public void setPizzaSize(Size newSize) {
        pizzas.get(getSelectedPizza()).setSize(newSize);
    }
    public Size getPizzaSize() {
        return pizzas.get(getSelectedPizza()).getSize();
    }
    
    public void setPizzaSauce(, Sauce newSauce) {
        pizzas.get(getSelectedPizza()).setSauce(newSauce);
    }
    public Sauce getPizzaSauce() {
        return pizzas.get(getSelectedPizza()).getSauce();
    }
    
    public void setPizzaTopping1(, Topping newTopping) {
        pizzas.get(getSelectedPizza()).setTopping1(newTopping);
    }
    public Topping getPizzaTopping1() {
        return pizzas.get(getSelectedPizza()).getTopping1();
    }

    public void setPizzaTopping2(, Topping newTopping) {
        pizzas.get(getSelectedPizza()).setTopping2(newTopping);
    }
    public Topping getPizzaTopping2() {
        return pizzas.get(getSelectedPizza()).getTopping2();
    }

}
