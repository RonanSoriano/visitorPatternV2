package visitorPatternV2;
public class ECommerceApp {
    public static void main(String[] args) {

        Chair chair = new Chair(175);
        Table table = new Table(18.7);
        Sofa sofa = new Sofa(6000);
        Aircon aircon = new Aircon(75);

        FurnitureType shippingCostCalculator = new ShippingCostCalculator();

        double chairShipCost = chair.accept(shippingCostCalculator);
        double tableShipCost = table.accept(shippingCostCalculator);
        double sofaShipCost = sofa.accept(shippingCostCalculator);
        double airconShipCost = aircon.accept(shippingCostCalculator);

        System.out.println("The Shipping cost for chair based on the quantity: $" + chairShipCost);
        System.out.println("The Shipping cost for table based on the size: $" + tableShipCost);
        System.out.println("The Shipping cost for sofa based on the distance to ship: $" + sofaShipCost);
        System.out.println("The Shipping cost for aircon based on the weight: $" + airconShipCost);
    }
}
