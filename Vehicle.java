interface IVehicle{
    public void addFuel(double amount);
    public double getDistance();
    public double getTime();
    public double getLevel();
    public double getFuelCost();
    public void travel(double distance);
}

public class Vehicle implements IVehicle{
    // Complete the class
    //D: VehicleType our_object =  new VehicleType();
    public Vehicle(){
        // our_object = object_param;
    }

    @Override
    public void addFuel(double amount){
        // object.addFuel
    }

    @Override
    public double getDistance(){

        return 0;
    }

    @Override
    public double getTime(){
        return 0;
    }

    @Override
    public double getLevel(){
        return 0;
    }

    @Override
    public double getFuelCost(){
        return 0;
    }

    @Override
    public void travel(double distance){

    }
}

public class VehicleUtility {
    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " + /*...*/ + "km");
        System.out.println("Travel Time: " + /*...*/ + " hours");
        System.out.println("Current Fuel Level: " + /*...*/ + "L");
        System.out.println("Fuel Cost: $" + /*...*/);
        System.out.println();
    }
}
