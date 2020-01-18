package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    private void initCarsList() {
        cars.add(new Car(1L, "Lada", "priora"));
        cars.add(new Car(2L, "audi", "q5"));
        cars.add(new Car(3L, "bmw", "x5"));
    }

    @Override
    public List<Car> getAllCar() {
        initCarsList();
        return cars;
    }

}
