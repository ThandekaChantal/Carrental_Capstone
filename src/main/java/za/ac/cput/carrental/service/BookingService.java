/*BookingService.java
Author: Tanatswa Mabhodha 220637482
07 July 2026
 */


package za.ac.cput.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.carrental.domain.Booking;
import za.ac.cput.carrental.factory.BookingFactory;
import za.ac.cput.carrental.repository.BookingRepository;

import java.util.List;

@Service
 public class BookingService implements IBookingService {

    private final BookingRepository bookingRepository;

@Autowired
    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking create(String memberId,
                          String carId,
                          String startDate,
                          String endDate,
                          double totalCost){
        Booking booking = BookingFactory.createBooking(memberId,carId,startDate,
                endDate,totalCost);
        return bookingRepository.save(booking);
    }

    @Override
    public Booking read(String bookingId){
        return bookingRepository.findById(bookingId).orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

    @Override
    public boolean delete(String bookingId){
        if (bookingRepository.existsById(bookingId)){
            bookingRepository.deleteById(bookingId);
            return true;
        }
        return false;
    }

    @Override
    public List<Booking> getAll(){
        return bookingRepository.findAll();
    }
}
