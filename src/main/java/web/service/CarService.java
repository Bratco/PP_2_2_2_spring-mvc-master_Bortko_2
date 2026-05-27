package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Lada", "Priora", 2010));
        cars.add(new Car("Audi", "80", 1987));
        cars.add(new Car("Mersedes", "E", 2008));
        cars.add(new Car("Subaru", "Impreza", 2008));
        cars.add(new Car("Land Rover", "Discovery", 2011));
        cars.add(new Car("LandR", "Di", 2013));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >=cars.size()) {
            return new ArrayList<>(cars);
        }

        if (count <= 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(cars.subList(0, count));
    }
}
