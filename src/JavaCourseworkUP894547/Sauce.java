package JavaCourseworkUP894547;

public enum Sauce {

    TOMATO(0.00){
        public String toString() {
            return "Tomato JavaCourseworkUP894547.Sauce";
        }
    },
    PESTO(0.50){
        public String toString() {
            return "Pesto JavaCourseworkUP894547.Sauce";
        }
    };

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
