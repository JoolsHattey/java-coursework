public class TestPizza {

    public static void main(String[] args){
        Pizza pizza = new Pizza();
        pizza.setSize(Size.MEDIUM);
        pizza.setCrust(Crust.THIN);
        pizza.setSauce(Sauce.PESTO);
        pizza.setTopping1(Topping.EXTRA_CHEESE);
        pizza.setTopping2(Topping.CHILLI);

        System.out.println(pizza.returnInfo());
    }

}
