/* BookingServiceTest.java
Author: Tanatswa Mabhodha 220637482
Date: 05 July 2026
 */




package za.ac.cput.carrental.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.carrental.domain.Booking;
import za.ac.cput.carrental.factory.BookingFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookingServiceTest {
    private Booking booking;

    @BeforeEach
    void setup() {
        booking = BookingFactory.createBooking("M001",
                "C001",
                "2026-09-01",
                "2026-09-05",
                1800.00
        );
    }

    @Test
    void testBookingIsNotNull(){
        assertNotNull(booking);
    }

    @Test
    void testGetMemberId(){
        assertEquals("M001", booking.getMemberId());
    }

    @Test
    void testGetCarId(){
        assertEquals("C001", booking.getCarId());
    }

    @Test
    void testGetStartDate(){
        assertEquals("2026-09-01", booking.getStartDate());
    }

    @Test
    void testGetEndDate(){
        assertEquals("2026-09-05", booking.getEndDate());
    }

    @Test
    void testGetTotalCost(){
        assertEquals(1800, booking.getTotalCost());
    }

    @Test
    void testCalculateRentalDuration(){
        assertEquals(4,  booking.calculateRentalDuration());
    }

    @Test
    void testExtendRental(){
        booking.extendRental("2026-09-10");
        assertEquals("2026-09-10", booking.getEndDate());
    }

    @Test
    void testToString(){
        assertNotNull(booking.toString());
    }

}
