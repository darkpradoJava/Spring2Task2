package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private Car[] cars = {new Car(1L, "Lada", "priora"),
    new Car(2L, "audi", "q5"),
    new Car(3L, "bmw", "x5")};

    private List<Car> carsList = Arrays.asList(cars);

    @Override
    public List<Car> getAllCar() {
        return carsList;
    }

}
