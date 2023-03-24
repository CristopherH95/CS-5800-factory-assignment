package factory;

import java.util.HashMap;

public class BoatFactory extends VehicleFactory {
    private static final HashMap<BoatVendor, BoatFactory> factories = new HashMap<>();

    private BoatFactory(BoatVendor vendor) {
        super(vendor);
    }

    public static BoatFactory getInstance(BoatVendor vendor) {
        if (!factories.containsKey(vendor)) {
            factories.put(vendor, new BoatFactory(vendor));
        }
        return factories.get(vendor);
    }

    @Override
    public void build() {
        System.out.printf("%s built a boat.%n", getVendorName());
    }

    @Override
    public void repair() {
        System.out.printf("%s repaired a boat.%n", getVendorName());
    }

    @Override
    public void restore() {
        System.out.printf("%s restored a boat.%n", getVendorName());
    }
}
