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
