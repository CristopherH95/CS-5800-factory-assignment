package factory;

import java.util.HashMap;

public class AirplaneFactory extends VehicleFactory {
    private static final HashMap<AirplaneVendor, AirplaneFactory> factories = new HashMap<>();

    private AirplaneFactory(AirplaneVendor vendor) {
        super(vendor);
    }

    public static AirplaneFactory getInstance(AirplaneVendor vendor) {
        if (!factories.containsKey(vendor)) {
            factories.put(vendor, new AirplaneFactory(vendor));
        }
        return factories.get(vendor);
    }

    @Override
    public void build() {
        System.out.printf("%s built an airplane.%n", getVendorName());
    }

    @Override
    public void repair() {
        System.out.printf("%s repaired an airplane.%n", getVendorName());
    }

    @Override
    public void restore() {
        System.out.printf("%s restored an airplane.%n", getVendorName());
    }
}
