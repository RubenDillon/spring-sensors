package org.tanzu.demo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SensorRepository extends CrudRepository<Sensor, Integer> {

    List<Sensor> findFirst10ByOrderByIdDesc();

}
