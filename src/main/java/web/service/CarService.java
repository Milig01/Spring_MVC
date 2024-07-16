package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    public final List<Car> cars = Arrays.asList(
            new Car("Mega", "BMW", 12),
            new Car("Ultra", "Mercedes", 5),
            new Car("Super", "Toyota", 17),
            new Car("Like", "Mitsubishi", 1),
            new Car("Deep", "Bugatti", 1988)
    );

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
