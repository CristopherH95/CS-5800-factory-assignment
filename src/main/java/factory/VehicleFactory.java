package factory;

public abstract class VehicleFactory implements FactoryServiceProvider {
    protected VehicleVendor vendor;

    public VehicleFactory(VehicleVendor vendor) {
        this.vendor = vendor;
    }

    protected String getVendorName() {
        return vendor.getLabel();
    }

    abstract public void build();
    abstract public void repair();
    abstract public void restore();
}
