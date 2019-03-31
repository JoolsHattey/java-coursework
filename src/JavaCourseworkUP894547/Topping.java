package JavaCourseworkUP894547;

public enum Topping {

    NONE(0.00){
        public String toString() {
            return "No";
        }
    },
    OLIVES(0.08){
        public String toString() {
            return "Olive";
        }
    },
    EXTRA_CHEESE(0.02){
        public String toString() {
            return "Extra Cheese";
        }
    },
    CHILLI(0.06){
        public String toString() {
            return "Chilli";
        }
    },
    PEPPERONI(0.10){
        public String toString() {
            return "Pepperoni";
        }
    },
    MUSHROOM(0.03){
        public String toString() {
            return "Mushroom";
        }
    },
    ROCKET(0.05){
        public String toString() {
            return "Rocket";
        }
    },
    JALAPENOS(0.20){
        public String toString() {
            return "Jalapenos";
        }
    },
    ONION(0.07){
        public String toString() {
            return "Onion JavaCourseworkUP894547.Topping";
        }
    },
    ANCHOVY(0.09){
        public String toString() {
            return "Anchovy JavaCourseworkUP894547.Topping";
        }
    };

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
