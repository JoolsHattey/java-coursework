public enum Crust {

    THIN(1.08),
    DEEP(1.10),
    STUFFED(2.14);

    private double cost;

    Crust(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getCostAsString() {
        return String.valueOf(cost);
    }

}
