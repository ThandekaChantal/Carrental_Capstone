package za.ac.cput.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.carrental.domain.Garage;

public interface InsuranceRepository extends JpaRepository<Garage, String> {

}
