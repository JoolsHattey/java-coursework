package JavaCourseworkUP894547;

import java.text.DecimalFormat;

public class Pizza {

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

    public double calculateCost() {
        double total, base;
        base = getSize().getCost() + getCrust().getCost();
        total = base + getTopping1TotalCost() + getTopping2TotalCost() + getSauce().getCost();
        return total;
    }

    public String returnInfo() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("TOTAL COST: £%.2f",calculateCost()));
        info.append(String.format("\n%s: £%.2f",getSize().toString(),getSize().getCost()));
        info.append(String.format("\n%s: £%.2f",getCrust().toString(),getCrust().getCost()));
        info.append(String.format("\nBASE COST: £%.2f",(getSize().getCost()+getCrust().getCost())));
        info.append(String.format("\n%s: 5* £%.2f = £%.2f",getTopping1().toString(),getTopping1().getCost(), getTopping1TotalCost()));
        info.append(String.format("\n%s: 4* £%.2f = £%.2f",getTopping2().toString(),getTopping2().getCost(), getTopping2TotalCost()));
        info.append(String.format("\n%s: £%.2f",getSauce().toString(),getSauce().getCost()));
        return info.toString();
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
