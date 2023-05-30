package org.tanzu.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sensor {

    @Id
    @GeneratedValue
    int id;
    int temperature;
    int pressure;

    public Sensor() {
    }

    public Sensor(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getId() {
        return id;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }
}
