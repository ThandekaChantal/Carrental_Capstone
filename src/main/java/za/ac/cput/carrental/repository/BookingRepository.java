package za.ac.cput.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.carrental.domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
}
