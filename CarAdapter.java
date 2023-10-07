/*  
 *  SED505 Design Patterns: Assignment 2 - Travel Simulation
 *  
 *  CarAdapter.Java - adapter class for legacy Car class
 * 
 *  Authors: Dennis Audu, Yiyuan Dong, Kannav Seith
 * 
 *  Created: Oct 1, 2023
 *  
 */

public class CarAdapter implements Vehicle{

    private Car car = new Car();

    @Override
    public void addFuel(double amount){
        car.carAddFuel(amount);
    }

    @Override
    public double getDistance(){
        return car.getCarDistance();
    }

    @Override
    public double getTime(){
        return car.getCarTime();
    }

    @Override
    public double getFuelLevel(){
        return car.getCarFuelLevel();
    }

    @Override
    public double getFuelCost(){
        return car.getCarFuelCost();
    }

    @Override
    public void travel(double distance){
        car.carTravel(distance);
    }
}
