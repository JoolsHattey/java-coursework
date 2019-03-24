public enum Crust {

    THIN(1.08){
        public String toString() {
            return "Thin Crust";
        }
    },
    DEEP(1.10){
        public String toString() {
            return "Deep Crust";
        }
    },
    STUFFED(2.14){
        public String toString() {
            return "Stuffed Crust";
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
