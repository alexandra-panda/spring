package oop.md.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/masini")
public class CarsWebService<numele> {

    Cars  cars = new Cars(double car_id,String numele,String producatorul,int pretul);

    @PostMapping("/addname/{name}")
    public List<String> addname(@PathVariable("name") String name){

        cars.cars.add(name);
        cars.cars.forEach(System.out::println);
        return (cars.cars);
    }


    @PutMapping("/addcar")
    public List<String> getCarName(@RequestParam String carName) {
        cars.cars.add(carName);
        return (cars.cars);
    }

    @GetMapping("/all")
    public List<String> cars(){
        return (cars.cars);
    }

    @DeleteMapping("/delName/{name}")
    public List<String> delName(@PathVariable("name") String name){
        cars.cars.remove(name);
        return (cars.cars);
    }
}
