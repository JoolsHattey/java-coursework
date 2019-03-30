public class Pizza {

    private int id;
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1, topping2;

    public Pizza(int newId) {
        this.id = newId;
    }

    public double calculateCost() {
        double total, base;
        base = getSize().getCost() + getCrust().getCost();
        total = base + getTopping1TotalCost() + getTopping2TotalCost() + getSauce().getCost();
        return total;
    }

    public String returnInfo() {
    return "TOTAL COST: £" + String.valueOf(calculateCost())+
            "\n"+getSize().toString()+": £"+getSize().getCostAsString()+
            "\n"+getCrust().toString()+": £"+getCrust().getCostAsString()+
            "\n"+"BASE COST: £"+(getSize().getCost()+getCrust().getCost())+
            "\n"+getTopping1().toString()+ ": 5* £"+getTopping1().getCostAsString()+" = "+getTopping1TotalCost()+
            "\n"+getTopping2().toString()+ ": 4* £"+getTopping2().getCostAsString()+" = "+getTopping2TotalCost()+
            "\n"+getSauce().toString()+ ": £" +getSauce().getCostAsString();
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
