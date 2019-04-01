package JavaCourseworkUP894547;

import java.text.DecimalFormat;

public class Pizza {

    private int id;
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1, topping2;
    
    public Pizza() {
        this.size = Size.DEFAULT;
        this.crust = Crust.DEFAULT;
        this.sauce = Sauce.DEFAULT;
        this.topping1 = Topping.NONE;
        this.topping2 = Topping.NONE;
    }

    public Pizza(int newId) {
        this.id = newId;
        this.size = Size.DEFAULT;
        this.crust = Crust.DEFAULT;
        this.sauce = Sauce.DEFAULT;
        this.topping1 = Topping.NONE;
        this.topping2 = Topping.NONE;
    }

    public double calculateCost() {
        double total, base;
        base = getSize().getCost() + getCrust().getCost();
        total = base + getTopping1TotalCost() + getTopping2TotalCost() + getSauce().getCost();
        return total;
    }

    public String returnInfo() {
        DecimalFormat df = new DecimalFormat("###.##");
        return "TOTAL COST: £" + String.format("%.2f",calculateCost())+
            "\n"+getSize().toString()+": £"+String.format("%.2f",getSize().getCost())+
            "\n"+getCrust().toString()+": £"+String.format("%.2f",getCrust().getCost())+
            "\n"+"BASE COST: £"+String.format("%.2f",(getSize().getCost()+getCrust().getCost()))+
            "\n"+getTopping1().toString()+ ": 5* £"+String.format("%.2f = %.2f",getTopping1().getCost(), getTopping1TotalCost())+
            "\n"+getTopping2().toString()+ ": 4* £"+String.format("%.2f = %.2f",getTopping2().getCost(), getTopping2TotalCost())+
            "\n"+getSauce().toString()+ ": £" +String.format("%.2f",getSauce().getCost());
    }

    public int getId() {
        return this.id;
    }

    public void setSize(Size newSize) {
        this.size = newSize;
    }
    public Size getSize() {
        return this.size;
    }

    public void setCrust(Crust newCrust) {
        this.crust = newCrust;
    }
    public Crust getCrust() {
        return this.crust;
    }

    public void setSauce(Sauce newSauce) {
        this.sauce = newSauce;
    }
    public Sauce getSauce() {
        return this.sauce;
    }

    public void setTopping1(Topping newTopping1) {
        this.topping1 = newTopping1;
    }
    public Topping getTopping1() {
        return this.topping1;
    }
    public double getTopping1TotalCost() {
        return 5 * getTopping1().getCost();
    }

    public void setTopping2(Topping newTopping2) {
        this.topping2 = newTopping2;
    }
    public Topping getTopping2() {
        return this.topping2;
    }
    public double getTopping2TotalCost() {
        return 4 * getTopping2().getCost();
    }
}
