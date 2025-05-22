package model;

import model.interfaces.EngineVehicle;
import model.interfaces.TrailerVehicle;

public class Truck extends Vehicle implements EngineVehicle, TrailerVehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
