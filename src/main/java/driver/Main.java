package driver;

import factory.*;

public class Main {
    public static void main(String[] args) {
        runCarFactoriesTest();
        runAirplaneFactoriesTest();
        runBoatFactoriesTest();
    }

    private static void runCarFactoriesTest() {
        CarFactory hondaFactory = CarFactory.getInstance(CarVendor.HONDA);
        CarFactory porscheFactory = CarFactory.getInstance(CarVendor.PORSCHE);
        CarFactory teslaFactory = CarFactory.getInstance(CarVendor.TESLA);

        testFactories(hondaFactory, porscheFactory, teslaFactory);

        CarFactory secondTeslaFactory = CarFactory.getInstance(CarVendor.TESLA);
        System.out.println("Attempt to create second tesla factory:");
        printFactories(teslaFactory, secondTeslaFactory);
    }

    private static void runAirplaneFactoriesTest() {
        AirplaneFactory airbusFactory = AirplaneFactory.getInstance(AirplaneVendor.AIRBUS);
        AirplaneFactory boeingFactory = AirplaneFactory.getInstance(AirplaneVendor.BOEING);
        AirplaneFactory embraerFactory = AirplaneFactory.getInstance(AirplaneVendor.EMBRAER);

        testFactories(airbusFactory, boeingFactory, embraerFactory);

        AirplaneFactory secondAirbusFactory = AirplaneFactory.getInstance(AirplaneVendor.AIRBUS);
        System.out.println("Attempt to create second Airbus factory:");
        printFactories(airbusFactory, secondAirbusFactory);
    }

    private static void runBoatFactoriesTest() {
        BoatFactory seaRayFactory = BoatFactory.getInstance(BoatVendor.SEARAY);
        BoatFactory masterCraftFactory = BoatFactory.getInstance(BoatVendor.MASTERCRAFT);
        BoatFactory bertramFactory = BoatFactory.getInstance(BoatVendor.BERTRAM);

        testFactories(seaRayFactory, masterCraftFactory, bertramFactory);
    }

    private static void testFactories(VehicleFactory... factories) {
        for (VehicleFactory factoryInstance : factories) {
            testFactoryMethods(factoryInstance);
        }
    }

    private static void testFactoryMethods(VehicleFactory factory) {
        factory.build();
        factory.repair();
        factory.restore();
    }

    private static void printFactories(VehicleFactory... factories) {
        for (VehicleFactory factoryInstance : factories) {
            System.out.println(factoryInstance);
        }
    }
}