package JavaCourseworkUP894547;

import java.util.ArrayList;

public class Order {
    
    private ArrayList<Pizza> pizzas;
    private int selectedPizza;

    public Order() {
        pizzas = new ArrayList<Pizza>();
    }

    public String returnInfo() {
        //String output = "";
        StringBuilder info = new StringBuilder();
        if (getPizzas().isEmpty()) {
            return "No Pizzas";
        } else {
            for(Pizza pizza: getPizzas()) {
                info.append(pizza.returnInfo()+"\n\n");
            }
            return info.toString();
        }
    }
    
    public Pizza getPizza(int index) {
        this.selectedPizza = index;
        return this.pizzas.get(index);
        
    }
    public Pizza getPizza() {
        return this.pizzas.get(getSelectedPizza());
    }    
    
    public String returnSpecificInfo() {
        return getPizzas().get(getSelectedPizza()).returnInfo();
    }

    public double returnCost() {
        double cost = 0;
        for(Pizza pizza : getPizzas()) {
            cost += pizza.calculateCost();
        }
        return cost;
    }

    public int numPizzas() {
        return getPizzas().size();
    }

    public void createPizza() {
        Pizza newPizza = new Pizza();
        this.pizzas.add(newPizza);
    }
    
    public void addPizza(Pizza newPizza) {
        this.pizzas.add(newPizza);
    }
    public void modifyPizza(int index, Pizza newPizza) {
        this.pizzas.set(index, newPizza);
    }

    public void deletePizza() {
        this.pizzas.remove(getSelectedPizza());
    }
    
    public void selectPizza(int index) {
        this.selectedPizza = index;
    }
    public int getSelectedPizza() {
        return this.selectedPizza;
    }
    
    public ArrayList<Pizza> getPizzas() {
        return this.pizzas;
    }
    
    public void setPizzaSize(Size newSize) {
        this.pizzas.get(getSelectedPizza()).setSize(newSize);
    }
    public Size getPizzaSize() {
        return this.pizzas.get(getSelectedPizza()).getSize();
    }
    
    public void setPizzaCrust(Crust newCrust) {
        this.pizzas.get(getSelectedPizza()).setCrust(newCrust);
    }
    public Crust getPizzaCrust() {
        return this.pizzas.get(getSelectedPizza()).getCrust();
    }
    
    public void setPizzaSauce(Sauce newSauce) {
        this.pizzas.get(getSelectedPizza()).setSauce(newSauce);
    }
    public Sauce getPizzaSauce() {
        return this.pizzas.get(getSelectedPizza()).getSauce();
    }
    
    public void setPizzaTopping1(Topping newTopping) {
        this.pizzas.get(getSelectedPizza()).setTopping1(newTopping);
    }
    public Topping getPizzaTopping1() {
        return this.pizzas.get(getSelectedPizza()).getTopping1();
    }

    public void setPizzaTopping2(Topping newTopping) {
        this.pizzas.get(getSelectedPizza()).setTopping2(newTopping);
    }
    public Topping getPizzaTopping2() {
        return this.pizzas.get(getSelectedPizza()).getTopping2();
    }

}
