public enum Topping {

    NONE(0.00){},
    OLIVES(0.08),
    EXTRA_CHEESE(0.02),
    CHILLI(0.06),
    PEPPERONI(0.10),
    MUSHROOM(0.03),
    ROCKET(0.05),
    JALAPENOS(0.20),
    ONION(0.07),
    ANCHOVY(0.09);

    private double cost;

    Topping(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getCostAsString() {
        return String.valueOf(cost);
    }

}
