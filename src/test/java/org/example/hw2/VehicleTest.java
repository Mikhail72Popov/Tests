/**
package org.example.hw2;
import main.java.org.example.hw2.Vehicle;
import main.java.org.example.hw2.Car;
import main.java.org.example.hw2.Motorcycle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car(“ВАЗ”, “2121”, 2000);
        Assert.assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car(“УАЗ”, “321”, 2017);
        Assert.assertEquals(car.getNumWheels(), 4);
    }
    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle(“ИЖ”, “Юпитер”, 1999);
        Assert.assertEquals(motorcycle.getNumWheels(), 2);
    }
    @Test
    public void testCarSpeed() {
        Car car = new Car(“УАЗ”, “321”, 2017);
        car.drive();
        Assert.assertEquals(car.getSpeed(), 60);
    }
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle(“ИЖ”, “Юпитер”, 1999);
        motorcycle.drive();
        Assert.assertEquals(motorcycle.getSpeed(), 75);
    }
}
 */