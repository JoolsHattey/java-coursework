package Server;

import java.util.ArrayList;

public class Order {
    
    private ArrayList<Pizza> pizzas;
    private int selectedPizza;

    public Order() {
        pizzas = new ArrayList<Pizza>();
    }
    
    public String returnInfo() {
        //String output = "";
        int pos = 1;
        StringBuilder info = new StringBuilder();
        if (getPizzas().isEmpty()) {
            return "No Pizzas";
        } else {
            for(Pizza pizza: getPizzas()) {
                info.append("PIZZA " + String.valueOf(pos) + "\n");
                info.append(pizza.returnInfo()+"\n\n");
                pos++;
            }
            return info.toString();
        }
    }
    
    public Pizza getPizza(int index) {
        selectPizza(index);
        return getPizzas().get(index);
        
    }
    public Pizza getPizza() {
        return getPizzas().get(getSelectedPizza());
    }    
    
    public String returnSpecificInfo() {
        return getPizzas().get(getSelectedPizza()).returnInfo();
    }

    public double returnCost() {
        double cost = 0;
        for(Pizza pizza : getPizzas()) {
            cost += pizza.calculateTotalCost();
        }
        return cost;
    }

    public int numPizzas() {
        return getPizzas().size();
    }

    public void createPizza() {
        Pizza newPizza = new Pizza();
        getPizzas().add(newPizza);
    }
    
    public void addPizza(Pizza newPizza) {
        getPizzas().add(newPizza);
    }
    public void modifyPizza(int index, Pizza newPizza) {
        getPizzas().set(index, newPizza);
    }

    public void deletePizza() {
        getPizzas().remove(getSelectedPizza());
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
    public void setPizzas(ArrayList<Pizza> newPizzas) {
        this.pizzas = newPizzas;
    }
    
    public void setPizzaSize(Size newSize) {
        getPizzas().get(getSelectedPizza()).setSize(newSize);
    }
    public Size getPizzaSize() {
        return getPizzas().get(getSelectedPizza()).getSize();
    }
    
    public void setPizzaCrust(Crust newCrust) {
        getPizzas().get(getSelectedPizza()).setCrust(newCrust);
    }
    public Crust getPizzaCrust() {
        return getPizzas().get(getSelectedPizza()).getCrust();
    }
    
    public void setPizzaSauce(Sauce newSauce) {
        getPizzas().get(getSelectedPizza()).setSauce(newSauce);
    }
    public Sauce getPizzaSauce() {
        return getPizzas().get(getSelectedPizza()).getSauce();
    }
    
    public void setPizzaTopping1(Topping newTopping) {
        getPizzas().get(getSelectedPizza()).setTopping1(newTopping);
    }
    public Topping getPizzaTopping1() {
        return getPizzas().get(getSelectedPizza()).getTopping1();
    }

    public void setPizzaTopping2(Topping newTopping) {
        getPizzas().get(getSelectedPizza()).setTopping2(newTopping);
    }
    public Topping getPizzaTopping2() {
        return getPizzas().get(getSelectedPizza()).getTopping2();
    }

}
