package br.com.aula1.tt.staticcrud.controller;

import br.com.aula1.tt.staticcrud.model.Car;
import br.com.aula1.tt.staticcrud.repository.CarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/aula1/tt")
public class CarController {

    private CarRepository carRepository = new CarRepository();

    @GetMapping("/car")
    public ResponseEntity<?> getAllCars() {
        return ResponseEntity.ok(carRepository.findAll());
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<?> getCarById(@PathVariable long id) {
        Car res = carRepository.findById(id);

        if(res != null) {
            return ResponseEntity.ok(res);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Carro não encontrado.");
        }
    }

    @PostMapping("/car")
    public ResponseEntity<?> createCar(@RequestBody Car car, UriComponentsBuilder uriBuilder) {
        Car addedCar = carRepository.add(car);
        URI uri = uriBuilder.path("/aula1/tt/car/{id}").buildAndExpand(addedCar.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/car/{id}")
    public ResponseEntity<?> updateCar(@PathVariable long id, @RequestBody Car car) {
        Car res = carRepository.update(id, car);

        if(res != null) {
            return ResponseEntity.ok(res);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Carro não encontrado.");
        }
    }

    @DeleteMapping("/car/{id}")
    public ResponseEntity<?> deleteCarById(@PathVariable long id) {
        Car res = carRepository.deleteById(id);

        if(res != null) {
            return ResponseEntity.ok(res);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Carro não encontrado.");
        }
    }
}
