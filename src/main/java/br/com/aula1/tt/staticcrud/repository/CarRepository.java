package br.com.aula1.tt.staticcrud.repository;

import br.com.aula1.tt.staticcrud.model.Car;

import java.util.*;

public class CarRepository {
    private static Map<Long, Car> db = new HashMap<>();
    private static Long id = 1l;

    public static List<Car> findAll() {
        List<Car> res = new ArrayList<>();

        for(Map.Entry<Long, Car> registro : db.entrySet()) {
            res.add(registro.getValue());
        }

        return  res;
    }

    public static Car findById(Long id) {
        if(db.containsKey(id)) {
            return db.get(id);
        } else {
            return null;
        }
    }

    public static Car add(Car car) {
        car.setId(id);
        db.put(id, car);
        id++;

        return db.get(id - 1);
    }

    public static Car update(Long id, Car car) {
        if(db.containsKey(id)) {
            car.setId(id);
            db.put(id, car);
            return db.get(id);
        }
        return null;
    }

    public static Car deleteById(Long id) {
       return db.remove(id);
    }
}
