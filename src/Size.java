public enum Size {

    SMALL(9.45){
        public String toString() {
            return "Small Size";
        }
    },
    MEDIUM(11.87){
        public String toString() {
            return "Medium Size";
        }
    },
    LARGE(15.90){
        public String toString() {
            return "Large Size";
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
