package za.ac.cput.carrental.factory;

/* CarFactory.java
     Car Class
     Author: Malwandla Blessing Mahori (230962963)
     Date: 25 June 2026 */

import za.ac.cput.carrental.domain.Car;
import za.ac.cput.carrental.util.Helper;

public class CarFactory {

    public static Car buildCar(String carId, String make, String model,
                               int year, double dailyRate, String status, int mileage) {

        if (Helper.isNullOrEmpty(carId))
            return null;
        if (Helper.isNullOrEmpty(make))
            return null;
        if (Helper.isNullOrEmpty(model))
            return null;
        if (!Helper.isValidYear(year))
            return null;
        if (!Helper.isPositiveDouble(dailyRate))
            return null;
        if (Helper.isNullOrEmpty(status))
            return null;
        if (!Helper.isNonNegativeInt(mileage))
            return null;

        return new Car.Builder()
                .carId(carId)
                .make(make)
                .model(model)
                .year(year)
                .dailyRate(dailyRate)
                .status(status)
                .mileage(mileage)
                .build();
    }
}