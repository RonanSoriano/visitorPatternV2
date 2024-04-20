package visitorPatternV2;

public class ShippingCostCalculator implements FurnitureType {
    private static final double shippingPerItem = 250.0;
    private static final double shippingPerSize = 150.0;
    private static final double shippingPerDistance = 80.0;
    private static final double shippingPerWeight = 75.0;

    @Override
    public double calculateShippingCost(Chair chair) {
        return shippingPerItem * chair.getQuantity();
    }

    @Override
    public double calculateShippingCost(Table table) {
        return shippingPerSize * table.getSize();
    }

    @Override
    public double calculateShippingCost(Sofa sofa) {
        return sofa.getDistance() * shippingPerDistance;
    }

    @Override
    public double calculateShippingCost(Aircon aircon) {
        return aircon.getWeight() * shippingPerWeight;
    }
}