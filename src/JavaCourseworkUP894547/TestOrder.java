package JavaCourseworkUP894547;

public class TestOrder {

    public static void main(String[] args) {

        Order order = new Order();

        order.addPizza();
        order.selectPizza(0);

        order.setPizzaSize(Size.MEDIUM);
        order.setPizzaCrust(Crust.THIN);
        order.setPizzaSauce(Sauce.PESTO);
        order.setPizzaTopping1(Topping.EXTRA_CHEESE);
        order.setPizzaTopping2(Topping.CHILLI);

        order.addPizza();
        order.selectPizza(1);

        order.setPizzaSize(Size.LARGE);
        order.setPizzaCrust(Crust.STUFFED);
        order.setPizzaSauce(Sauce.TOMATO);
        order.setPizzaTopping1(Topping.PEPPERONI);
        order.setPizzaTopping2(Topping.MUSHROOM);
        
        
        System.out.println(order.numPizzas()+" Pizzas in order");
        System.out.println(order.returnInfo());
        System.out.println(order.returnCost());
    }


}
