/* InsuranceService.java
        Insurance Service Implementation
        Author: Thandeka Chanatal Malande (222857005)
        Date: 12 July 2026 */

        package za.ac.cput.carrental.service;

import za.ac.cput.carrental.domain.Insurance;
import java.util.HashMap;

public class InsuranceService  IInsuranceService  {


        // In-memory store to hold Insurance objects (acts like a database for now)
        private HashMap<String, Insurance> store = new HashMap<>();

        // Singleton pattern - only one instance of the service exists
        private static InsuranceService instance = null;

        // Private constructor - use getInstance() instead
        private InsuranceService() {}

        public static InsuranceService getInstance() {
            if (instance == null) {
                instance = new InsuranceService();
            }
            return instance;
        }

        // CREATE - adds a new Insurance to the store
        @Override
        public Insurance create(Insurance insurance) {
            if (insurance == null || insurance.getInsuranceId() == null) {
                return null;
            }
            store.put(insurance.getInsuranceId(), insurance);
            return insurance;
        }

        // READ - retrieves an Insurance by its ID
        @Override
        public Insurance read(String insuranceId) {
            return store.get(insuranceId);
        }

        // UPDATE - replaces existing Insurance with updated version
        @Override
        public Insurance update(Insurance insurance) {
            if (insurance == null || !store.containsKey(insurance.getInsuranceId())) {
                return null;
            }
            store.put(insurance.getInsuranceId(), insurance);
            return insurance;
        }

        // DELETE - removes an Insurance from the store by its ID
        @Override
        public boolean delete(String insuranceId) {
            if (!store.containsKey(insuranceId)) {
                return false;
            }
            store.remove(insuranceId);
            return true;
        }
    }
