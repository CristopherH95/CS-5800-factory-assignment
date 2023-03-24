package factory;

public enum AirplaneVendor implements VehicleVendor {
    AIRBUS("Airbus"),
    BOEING("Boeing"),
    EMBRAER("Embraer");

    private final String label;

    AirplaneVendor(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
