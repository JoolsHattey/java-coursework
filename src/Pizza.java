public class Pizza {

    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1, topping2;

    public Pizza() {

    }

    public String returnInfo() {
        String info = "Total Cost: "  +
                format(size.name(), size.getCostAsString());
        return info;

    }



    private String format(String var1, String var2) {
        return String.format("%s : £%s", capatalise(var1), var2);
    }

    private String capatalise(String text) {
        String output = text.substring(0,1) + text.substring(1).toLowerCase();
        return output;
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

    public void setTopping2(Topping newTopping2) {
        this.topping2 = newTopping2;
    }
    public Topping getTopping2() {
        return this.topping2;
    }
}
