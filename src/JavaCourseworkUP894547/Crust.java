package JavaCourseworkUP894547;

public enum Crust {

    THIN(1.08){
        public String toString() {
            return "Thin JavaCourseworkUP894547.Crust";
        }
    },
    DEEP(1.10){
        public String toString() {
            return "Deep JavaCourseworkUP894547.Crust";
        }
    },
    STUFFED(2.14){
        public String toString() {
            return "Stuffed JavaCourseworkUP894547.Crust";
        }
    };

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
