package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String allCarWithHeader(ModelMap model, @RequestParam(value = "locale", defaultValue = "en") String locale) {
        List<Car> cars = carService.getAllCar();
        String loc;
        loc = (locale.equals("en")) ? "CARS" : "МАШИНЫ";
        model.addAttribute("locale", loc);
        model.addAttribute("carsList", cars);
        System.out.println(cars.size());
        return "cars";
    }

}
