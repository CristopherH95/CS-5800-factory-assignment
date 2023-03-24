package factory;

import java.util.HashMap;

public class CarFactory extends VehicleFactory {
    private static final HashMap<CarVendor, CarFactory> factories = new HashMap<>();

    private CarFactory(CarVendor vendor) {
        super(vendor);
    }

    public static CarFactory getInstance(CarVendor vendor) {
        if (!factories.containsKey(vendor)) {
            factories.put(vendor, new CarFactory(vendor));
        }
        return factories.get(vendor);
    }

    @Override
    public void build() {
        System.out.printf("%s built a car.%n", getVendorName());
    }

    @Override
    public void repair() {
        System.out.printf("%s repaired a car.%n", getVendorName());
    }

    @Override
    public void restore() {
        System.out.printf("%s restored a car.%n", getVendorName());
    }
}
