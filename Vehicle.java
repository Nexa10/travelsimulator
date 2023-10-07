/*  
 *  SED505 Design Patterns: Assignment 2 - Travel Simulation
 *  
 *  Vehicle.cs - inteface for boat, car and airplane adapters
 * 
 *  Modified by: Dennis Audu, Yiyuan Dong, Kannav Seith
 *  
 *  Date: Oct 1, 2023
 *  
 */




public interface Vehicle {
    public void addFuel(double amount);
    public double getDistance();
    public double getTime();
    public double getFuelLevel();
    public double getFuelCost();
    public void travel(double distance);
}

