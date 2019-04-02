package JavaCourseworkUP894547;

public class TestOrder {

    public static void main(String[] args) {
        
        Order order = new Order();
        
        //Creating 1st pizza using order object functions
        order.createPizza();
        order.selectPizza(0);
        
        order.setPizzaSize(Size.MEDIUM);
        order.setPizzaCrust(Crust.THIN);
        order.setPizzaSauce(Sauce.PESTO);
        order.setPizzaTopping1(Topping.EXTRA_CHEESE);
        order.setPizzaTopping2(Topping.CHILLI);
        
        //Creating 2nd pizza using order object functions
        order.createPizza();
        order.selectPizza(1);
        
        order.setPizzaSize(Size.LARGE);
        order.setPizzaCrust(Crust.STUFFED);
        order.setPizzaSauce(Sauce.TOMATO);
        order.setPizzaTopping1(Topping.PEPPERONI);
        order.setPizzaTopping2(Topping.MUSHROOM);
        
        //Created 3rd pizza object then added it to the list using addPizza
        Pizza pizza = new Pizza();
        pizza.setSize(Size.MEDIUM);
        pizza.setCrust(Crust.THIN);
        pizza.setSauce(Sauce.PESTO);
        pizza.setTopping1(Topping.EXTRA_CHEESE);
        pizza.setTopping2(Topping.CHILLI);
        order.addPizza(pizza);
        
        //Print output to console
        System.out.println(order.numPizzas()+" Pizzas in order");
        System.out.println(order.returnInfo());
        System.out.println(order.returnCost());
        
        //Edit pizza
        order.selectPizza(0);
        order.setPizzaSize(Size.LARGE);
        order.setPizzaSauce(Sauce.PESTO);
        order.setPizzaCrust(Crust.DEEP);
        order.setPizzaTopping1(Topping.PEPPERONI);
        order.setPizzaTopping2(Topping.ONION);
        
        System.out.println("\nOrder after edit:");
        System.out.println(order.returnInfo());
        System.out.println(order.returnCost());
    }


}
