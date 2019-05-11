package JavaCourseworkUP894547;

import Server.Size;
import Server.Sauce;
import Server.Crust;
import Server.Pizza;
import Server.Topping;

public class TestPizza {

    public static void main(String[] args){

        //Create Pizza
        System.out.println("-----------TEST PIZZA CLASS-----------");
        System.out.println("======================================");
        System.out.println("Creating Pizza With Following Data:\n"
                            + "Size: Medium\n"
                            + "Crust: Thin\n"
                            + "Sauce: Pesto\n"
                            + "Topping 1: Extra Cheese\n"
                            + "Topping 2: Chilli");
                
        Pizza pizza = new Pizza(
                            Size.MEDIUM,
                            Crust.THIN,
                            Sauce.PESTO,
                            Topping.EXTRA_CHEESE,
                            Topping.CHILLI);

        displayPizza(pizza);

        
        //Edit Pizza
        System.out.println("--------------EDIT PIZZA--------------");
        System.out.println("======================================");
        System.out.println("Change the following using get/set methods:\n"
                            + "Size: Large\n"
                            + "Crust: Stuffed\n"
                            + "Topping 2: Pepperoni");
        pizza.setSize(Size.LARGE);
        pizza.setCrust(Crust.STUFFED);
        pizza.setTopping2(Topping.PEPPERONI);
        
        displayPizza(pizza);
    }
    
    
    
    private static void displayPizza(Pizza pizza) {
        System.out.println("\n");
        System.out.println("-------------PIZZA DISPLAY------------");
        System.out.println("======================================");
        System.out.println(pizza.returnInfo());
        System.out.println("======================================");
        System.out.println("\n");
    }

}
