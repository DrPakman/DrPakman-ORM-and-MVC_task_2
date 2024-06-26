package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Mazda", "3", 2020));
        cars.add(new Car("BMW", "2", 2021));
        cars.add(new Car("Volvo", "S40", 2010));
        cars.add(new Car("Ford", "Focus", 2018) );
        cars.add(new Car("Kia", "Rio", 2015));
    }
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
