package model;

import model.interfaces.EngineVehicle;

public class Car extends Vehicle implements EngineVehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
