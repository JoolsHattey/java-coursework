package JavaCourseworkUP894547;

public enum Crust {
    
    DEFAULT(0.00){
        public String toString() {
            return "No Crust Selected";
        }
    },
    THIN(1.08){
        public String toString() {
            return "Thin";
        }
    },
    DEEP(1.10){
        public String toString() {
            return "Deep";
        }
    },
    STUFFED(2.14){
        public String toString() {
            return "Stuffed";
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
