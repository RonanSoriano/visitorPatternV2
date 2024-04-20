package visitorPatternV2;

public interface FurnitureType {
    public double calculateShippingCost(Chair chair);
    public double calculateShippingCost(Table table);
    public double calculateShippingCost(Sofa sofa);
    public double calculateShippingCost(Aircon aircon);
}
