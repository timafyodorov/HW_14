import model.*;
import service.ServiceStation;

public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        Vehicle car1 = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);

        Vehicle truck1 = new Truck("truck1", 6);
        Vehicle truck2 = new Truck("truck2", 8);

        Vehicle bicycle1 = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

        station.check(car1);
        station.check(car2);
        station.check(bicycle1);
        station.check(bicycle2);
        station.check(truck1);
        station.check(truck2);
    }
}
