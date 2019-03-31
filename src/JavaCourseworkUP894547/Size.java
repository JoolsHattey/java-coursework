package JavaCourseworkUP894547;

public enum Size {

    SMALL(9.45){
        public String toString() {
            return "Small";
        }
    },
    MEDIUM(11.87){
        public String toString() {
            return "Medium";
        }
    },
    LARGE(15.90){
        public String toString() {
            return "Large";
        }
    };

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
