/*  
 *  SED505 Design Patterns: Assignment 2 - Travel Simulation
 *  
 *  TravelSimulation.java  - contemporary travel simulation for a boat, car and airplane.
 * 
 *  Modified by: Dennis Audu, Yiyuan Dong, Kannav Seith
 *  
 *  Date: Oct 1, 2023
 * 
 */

import java.text.DecimalFormat;

class TravelSimulation {
    public static void main(String[] args) {
        VehicleUtility vehicleUtility = new VehicleUtility();
        
        // the boat travels 100km and information about the boat is printed
        Vehicle boat = new BoatAdapter();
        boat.travel(100.0);
        vehicleUtility.printVehicleInformation(boat, "Boat");

        // the car travels 1000km and information about the car is printed
        Vehicle car = new CarAdapter();
        car.travel(1000.0);
        vehicleUtility.printVehicleInformation(car, "Car");

        // the airplane travels 10000km and information about the airplane is printed
        Vehicle airplane = new AirplaneAdapter();
        airplane.travel(10000.0);
        vehicleUtility.printVehicleInformation(airplane, "Airplane");

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
        vehicleUtility.printVehicleInformation(boat, "Boat");

        // Car
        car.travel(1000.0);
        vehicleUtility.printVehicleInformation(car, "Car");

        // Airplane
        airplane.travel(10000.0);
        vehicleUtility.printVehicleInformation(airplane, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}


class VehicleUtility {
    public void printVehicleInformation(Vehicle vehicle, String vehicleType) {
        DecimalFormat df = new DecimalFormat("#.###");
        DecimalFormat df2 = new DecimalFormat("#.#");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " + df.format(vehicle.getDistance())+ "km");
        System.out.println("Travel Time: " + df.format(vehicle.getTime()) + " hours");
        System.out.println("Current Fuel Level: " + df2.format(vehicle.getFuelLevel()) + "L");
        System.out.println("Fuel Cost: $" +  df2.format(vehicle.getFuelCost()));
        System.out.println();
    }
}