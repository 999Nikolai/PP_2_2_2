package web.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private static int PEOPLE_COUNT;
    private final List<Car> machina;

    {
        machina = new ArrayList<>();
        machina.add(new Car(++PEOPLE_COUNT, "VOLVO", 90));
        machina.add(new Car(++PEOPLE_COUNT, "BMW", 3));
        machina.add(new Car(++PEOPLE_COUNT, "ГАЗ", 13));
        machina.add(new Car(++PEOPLE_COUNT, "ВАЗ", 2101));
        machina.add(new Car(++PEOPLE_COUNT, "ВАЗ", 2110));


    }

    @Override
    public List<Car> getCar(int count) {

        if (count > 0 && count < machina.size()) {
             return machina.subList(0,count);
        }
        return machina;

//        if (count > 0 && count < 5){
//            return machina.stream().limit(count).toList();
//        }
//        return machina;


    }


}
