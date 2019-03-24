public enum Topping {

    NONE(0.00){
        public String toString() {
            return "No Sauce";
        }
    },
    OLIVES(0.08){
        public String toString() {
            return "Olive Topping";
        }
    },
    EXTRA_CHEESE(0.02){
        public String toString() {
            return "Extra Cheese Topping";
        }
    },
    CHILLI(0.06){
        public String toString() {
            return "Chilling Topping";
        }
    },
    PEPPERONI(0.10){
        public String toString() {
            return "Pepperoni Topping";
        }
    },
    MUSHROOM(0.03){
        public String toString() {
            return "Mushroom Topping";
        }
    },
    ROCKET(0.05){
        public String toString() {
            return "Rocket Topping";
        }
    },
    JALAPENOS(0.20){
        public String toString() {
            return "Jalapenos Topping";
        }
    },
    ONION(0.07){
        public String toString() {
            return "Onion Topping";
        }
    },
    ANCHOVY(0.09){
        public String toString() {
            return "Anchovy Topping";
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
