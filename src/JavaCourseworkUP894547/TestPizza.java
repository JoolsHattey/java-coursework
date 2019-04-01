package JavaCourseworkUP894547;

public class TestPizza {

    public static void main(String[] args){

        Pizza pizza1 = new Pizza();
        
        System.out.println(pizza1.calculateCost());
        System.out.println(pizza1.returnInfo());

        pizza1.setSize(Size.MEDIUM);
        pizza1.setCrust(Crust.THIN);
        pizza1.setSauce(Sauce.PESTO);
        pizza1.setTopping1(Topping.EXTRA_CHEESE);
        pizza1.setTopping2(Topping.CHILLI);

        System.out.println(pizza1.calculateCost());
        System.out.println(pizza1.returnInfo());

        Pizza pizza2 = new Pizza();
        
        pizza2.setSize(Size.LARGE);
        pizza2.setCrust(Crust.STUFFED);
        pizza2.setSauce(Sauce.TOMATO);
        pizza2.setTopping1(Topping.PEPPERONI);
        pizza2.setTopping2(Topping.MUSHROOM);

        System.out.println(pizza2.calculateCost());
        System.out.println(pizza2.returnInfo());

    }

}
