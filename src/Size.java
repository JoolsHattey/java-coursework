public enum Size {

    SMALL(9.45),
    MEDIUM(11.87),
    LARGE(15.90);

    private double cost;

    Size(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getCostAsString() {
        return String.valueOf(cost);
    }

}
