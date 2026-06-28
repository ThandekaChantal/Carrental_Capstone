package za.ac.cput.carrental.factory;
import za.ac.cput.carrental.util.Helper;
import za.ac.cput.carrental.domain.Garage;

/*
 * GarageFactory.java
 * Garage Factory class
 * Author: 222359366
 * Date: 28 June 2026
 */


public class GarageFactory {
    public static Garage createGarage(String garageId,
                                      String garageName,
                                      String address,
                                      String city,
                                      String managerName) {
        return new Garage.Builder()
                .setGarageId(Helper.generateId())
                .setGarageName(garageName)
                .setAddress(address)
                .setCity(city)
                .setManagerName(managerName)
                .build();
    }
}