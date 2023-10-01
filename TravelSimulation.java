import Boat.Boat;

class TravelSimulation {
    public static void main(String[] args) {
        // the boat travels 100km and information about the boat is printed
        boat.boatTravel(100.0);
        printVehicleInformation(boat, "Boat");

        // the car travels 1000km and information about the car is printed
        car.carTravel(1000.0);
        printVehicleInformation(car, "Car");

        // the airplane travels 10000km and information about the airplane is printed
        airplane.airplaneTravel(10000.0);
        printVehicleInformation(airplane, "Airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.boatAddFuel(120);
        car.carAddFuel(40);
        airplane.airplaneAddFuel(50000);

        // Travel again
        // Boat
        boat.boatTravel(100.0);
        printVehicleInformation(boat, "Boat");

        // Car
        car.carTravel(1000.0);
        printVehicleInformation(car, "Car");

        // Airplane
        airplane.airplaneTravel(10000.0);
        printVehicleInformation(airplane, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}
