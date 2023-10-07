/*  
 *  SED505 Design Patterns: Assignment 2 - Travel Simulation
 *  
 *  AirplaneAdapter.Java - adapter class for legacy Airplane class
 * 
 *  Authors: Dennis Audu, Yiyuan Dong, Kannav Seith
 * 
 *  Created: Oct 1, 2023
 *  
 */

public class AirplaneAdapter implements Vehicle{
    private Airplane airplane = new Airplane();

    @Override
    public void addFuel(double amount){
        airplane.airplaneAddFuel(amount);
    }

    @Override
    public double getDistance(){
        return airplane.getAirplaneDistance();
    }

    @Override
    public double getTime(){
        return airplane.getAirplaneTime();
    }

    @Override
    public double getFuelLevel(){
        return airplane.getAirplaneFuelLevel();
    }

    @Override
    public double getFuelCost(){
        return airplane.getAirplaneFuelCost();
    }

    @Override
    public void travel(double distance){
        airplane.airplaneTravel(distance);
    }
}
