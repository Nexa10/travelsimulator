import java.text.DecimalFormat;

class TravelSimulation {
    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {
        DecimalFormat df = new DecimalFormat("#.###");
        DecimalFormat df2 = new DecimalFormat("#.#");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " + df.format(vehicle.getDistance())+ "km");
        System.out.println("Travel Time: " + df.format(vehicle.getTime()) + " hours");
        System.out.println("Current Fuel Level: " + df2.format(vehicle.getFuelLevel()) + "L");
        System.out.println("Fuel Cost: $" + vehicle.getFuelCost());
        System.out.println();
    }
    public static void main(String[] args) {
        
        // the boat travels 100km and information about the boat is printed
        Vehicle boat = new BoatAdapter();
        boat.travel(100.0);
        printVehicleInformation(boat, "Boat");

        // the car travels 1000km and information about the car is printed
        Vehicle car = new CarAdapter();
        car.travel(1000.0);
        printVehicleInformation(car, "Car");

        // the airplane travels 10000km and information about the airplane is printed
        Vehicle airplane = new AirplaneAdapter();
        airplane.travel(10000.0);
        printVehicleInformation(airplane, "Airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.addFuel(120);
        car.addFuel(40);
        airplane.addFuel(50000);

        // Travel again
        // Boat
        boat.travel(100.0);
        printVehicleInformation(boat, "Boat");

        // Car
        car.travel(1000.0);
        printVehicleInformation(car, "Car");

        // Airplane
        airplane.travel(10000.0);
        printVehicleInformation(airplane, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}
