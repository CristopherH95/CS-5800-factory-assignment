package factory;

public enum CarVendor implements VehicleVendor {
    HONDA("Honda"),
    PORSCHE("Porsche"),
    TESLA("Tesla");


    private final String label;

    CarVendor(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
