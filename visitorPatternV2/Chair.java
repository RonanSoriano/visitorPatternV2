package visitorPatternV2;

public class Chair implements Furniture {
    private double quantity;

    public Chair(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public double accept(FurnitureType visitor) {
        return visitor.calculateShippingCost(this);
    }
}
