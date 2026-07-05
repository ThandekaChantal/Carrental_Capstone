/* IBookingService.java
Author: Tanatswa Mabhodha 220637482
07 July 2026
 */

package za.ac.cput.carrental.service;

import za.ac.cput.carrental.domain.Booking;

import java.util.List;

public interface IBookingService {

    Booking create(String memberId,
                   String carId,
                   String startDate,
                   String endDate,
                   double totalCost);

     Booking read(String bookingId);
     Booking update(Booking booking);
     boolean delete(String bookingId);

     List<Booking> getAll();

}
