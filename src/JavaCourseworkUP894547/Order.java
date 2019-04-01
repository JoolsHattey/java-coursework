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
            output += pizza.returnInfo()+"\n"+"\n";
        }
        return output;
    }
    
    public Pizza getPizza(int id) {
        Pizza output = null;
        for(Pizza pizza : pizzas) {
            if(pizza.getId() == id) {
                output = (getPizzas().get(id));
            }
        }
        return output;
    }
    
    public String returnSpecificInfo() {
        return this.pizzas.get(getSelectedPizza()).returnInfo();
    }

    public double returnCost() {
        double cost = 0;
        for(Pizza pizza : pizzas) {
            cost += pizza.calculateCost();
        }
        return cost;
    }

    public int numPizzas() {
        return this.pizzas.size();
    }

    public void createPizza() {
        Pizza newPizza = new Pizza(getPizzas().size());
        this.pizzas.add(newPizza);
    }
    
    public void addPizza(Pizza newPizza) {
        this.pizzas.add(newPizza);
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
        this.pizzas.get(getSelectedPizza()).setCrust(newCrust);
    }
    public Crust getPizzaCrust() {
        return this.pizzas.get(getSelectedPizza()).getCrust();
    }

    public void setPizzaSize(Size newSize) {
        this.pizzas.get(getSelectedPizza()).setSize(newSize);
    }
    public Size getPizzaSize() {
        return this.pizzas.get(getSelectedPizza()).getSize();
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
