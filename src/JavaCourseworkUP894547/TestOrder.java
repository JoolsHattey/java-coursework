package JavaCourseworkUP894547;

public class TestOrder {

    public static void main(String[] args) {
        
        
        //Creating empty order and adding pizzas
        System.out.println("-------------ORDER CLASS TEST-------------");
        System.out.println("------------------------------------------");
        System.out.println("-----------CREATE EMPTY ORDER-------------");
        
        Order order = new Order();
        
        //1st Pizza
        System.out.println("Pizza 1 Creation and add to order:");
        System.out.println("Pizza Creating With Following Data:\n"
                + "Size: Medium\n"
                + "Crust: Thin\n"
                + "Sauce: Pesto\n"
                + "Topping 1: Extra Cheese\n"
                + "Topping 2: Chilli");
        System.out.println("\n");
        
        Pizza pizza1 = new Pizza(
                            Size.MEDIUM,
                            Crust.THIN,
                            Sauce.PESTO,
                            Topping.EXTRA_CHEESE,
                            Topping.CHILLI);
        order.addPizza(pizza1);
        
        //2nd Pizza
        System.out.println("Pizza 2 Creation and add to order:");
        System.out.println("Pizza Creating With Following Data:\n"
                + "Size: Medium\n"
                + "Crust: Stuffed\n"
                + "Sauce: Pesto\n"
                + "Topping 1: Olive\n"
                + "Topping 2: Onion");
        System.out.println("\n");
        
        Pizza pizza2 = new Pizza(
                            Size.MEDIUM,
                            Crust.STUFFED,
                            Sauce.PESTO,
                            Topping.OLIVES,
                            Topping.ONION);
        order.addPizza(pizza2);
        
        //3rd Pizza
        System.out.println("Pizza 3 Creation and add to order:");
        System.out.println("Pizza Creating With Following Data:\n"
                + "Size: Small\n"
                + "Crust: Thin\n"
                + "Sauce: Pesto\n"
                + "Topping 1: Chilli\n"
                + "Topping 2: Pepperoni");
        System.out.println("\n");
        
        Pizza pizza3 = new Pizza(
                            Size.SMALL,
                            Crust.THIN,
                            Sauce.PESTO,
                            Topping.CHILLI,
                            Topping.PEPPERONI);
        order.addPizza(pizza3);
        
        //4th Pizza
        System.out.println("Pizza 4 Creation and add to order:");
        System.out.println("Pizza Creating With Following Data:\n"
                + "Size: Small\n"
                + "Crust: Thin\n"
                + "Sauce: Pesto\n"
                + "Topping 1: Olive\n"
                + "Topping 2: Olive");
        System.out.println("\n");
        
        Pizza pizza4 = new Pizza(
                            Size.SMALL,
                            Crust.THIN,
                            Sauce.PESTO,
                            Topping.OLIVES,
                            Topping.OLIVES);
        order.addPizza(pizza4);
        
        
        //Selecting and deleting specifc pizza
        displayOrder(order);
        
        System.out.println("-----TESTING DELETE PIZZA-----");
        System.out.println("Deleting Pizza 3");
        
        order.selectPizza(2);
        order.deletePizza();
        
        displayOrder(order);
        
        
        //Selecting and updating specific pizza
        System.out.println("----TESTING EDIT PIZZA-----");
        System.out.println("Editing Pizza 1");
        System.out.println("Change the following using get/set methods:\n"
                + "Size: Large\n"
                + "Crust: Stuffed\n"
                + "Topping 2: Pepperoni");
        
        order.selectPizza(0);
        order.setPizzaSize(Size.LARGE);
        order.setPizzaCrust(Crust.STUFFED);
        order.setPizzaTopping2(Topping.PEPPERONI);
        
        displayOrder(order);      
    }
  

    
    public static void displayOrder(Order order) {
        System.out.println("\n");
        System.out.println("-------------ORDER DISPLAY------------");
        System.out.println("======================================");
        System.out.println("Number of Pizzas: " + String.valueOf(order.numPizzas()) + "\n");
        System.out.println(String.format("Total Order Cost: £%.2f\n", order.returnCost()));
        System.out.println(order.returnInfo());
        System.out.println("======================================");
        System.out.println("\n");
    }
}
