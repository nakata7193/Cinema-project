package reservation.model;

import models.Customer;
import models.Projection;

import java.time.LocalTime;

public interface Reservation {
    void addCustomer(Customer customer);

    void addProjection(Projection projection);

    void addSeat(String seat);

    void selectReservationTime(LocalTime reservationTime);

    void placeReservation();

    String getMessage();
}
