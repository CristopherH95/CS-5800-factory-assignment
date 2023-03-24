package factory;

public enum BoatVendor implements VehicleVendor {
    SEARAY("SeaRay"),
    MASTERCRAFT("Mastercraft"),
    BERTRAM("Bertram");

    private final String label;

    BoatVendor(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
