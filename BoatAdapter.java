/*  
 *  SED505 Design Patterns: Assignment 2 - Travel Simulation
 *  
 *  BoatAdapter.Java - adapter class for legacy Boat class
 * 
 *  Authors: Dennis Audu, Yiyuan Dong, Kannav Seith
 * 
 *  Created: Oct 1, 2023
 *  
 */


public class BoatAdapter implements Vehicle{
    private Boat boat = new Boat();

    @Override
    public void addFuel(double amount){
        boat.boatAddFuel(amount);
    }

    @Override
    public double getDistance(){
        return boat.getBoatDistance();
    }

    @Override
    public double getTime(){
        return boat.getBoatTime();
    }

    @Override
    public double getFuelLevel(){
        return boat.getBoatFuelLevel();
    }

    @Override
    public double getFuelCost(){
        return boat.getBoatFuelCost();
    }

    @Override
    public void travel(double distance){
        boat.boatTravel(distance);
    }
}
