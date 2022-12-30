package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarService service = new CarServiceImp();
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("messages",service.getCar(count));
        return "cars";
    }



}
