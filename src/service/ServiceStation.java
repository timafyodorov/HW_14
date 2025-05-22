package service;

import model.Vehicle;
import model.interfaces.EngineVehicle;
import model.interfaces.TrailerVehicle;

public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }

        if (vehicle instanceof EngineVehicle) {
            ((EngineVehicle) vehicle).checkEngine();
        }

        if (vehicle instanceof TrailerVehicle) {
            ((TrailerVehicle) vehicle).checkTrailer();
        }
    }
}
