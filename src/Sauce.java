public enum Sauce {

    TOMATO(0.00),
    PESTO(0.50);

    private double cost;

    Sauce(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getCostAsString() {
        return String.valueOf(cost);
    }

}
