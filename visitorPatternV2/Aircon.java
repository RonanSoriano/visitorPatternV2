package visitorPatternV2;

public class Aircon implements Furniture {
    private double weight;

    public Aircon(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double accept(FurnitureType visitor) {
        return visitor.calculateShippingCost(this);
    }
}