package br.com.aula1.tt.staticcrud.controller;

import br.com.aula1.tt.staticcrud.model.Car;
import br.com.aula1.tt.staticcrud.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aula1/tt")
public class CarController {

    private CarRepository carRepository = new CarRepository();

    @GetMapping("/car")
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable long id) {
        return carRepository.findById(id);
    }

    @PostMapping("/car")
    public void createCar(@RequestBody Car car) {
        carRepository.add(car);
    }

    @PutMapping("/car/{id}")
    public void updateCar(@PathVariable long id, @RequestBody Car car) {
        carRepository.update(id, car);
    }

    @DeleteMapping("/car/{id}")
    public Car deleteCarById(long id) {
        return carRepository.deleteById(id);
    }
}
