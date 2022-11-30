package org.example;

public class Car {
    private int maxSpeed;
    private double cityConsumption;
    private double highwayConsumption;

    public double getCombinedConsumption() {
        return (this.cityConsumption + this.highwayConsumption)/2;
    }

    public void getEstimatedDistance(double FuelQuantity, double cityDrivePercentage){
        System.out.println(FuelQuantity/cityDrivePercentage);
    }

}
