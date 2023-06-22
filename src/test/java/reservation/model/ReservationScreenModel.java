package reservation.model;


import controller.ReservationController;
import models.Customer;
import models.Projection;

import java.time.LocalTime;

public class ReservationScreenModel implements Reservation {

    private Customer customer;
    private Projection projection;
    private String seat;
    private LocalTime reservationTime;
    private String message;

    @Override
    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void addProjection(Projection projection) {
        this.projection = projection;
    }

    @Override
    public void addSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public void selectReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    @Override
    public void placeReservation() {
        this.message = ReservationController.place(this.customer, this.projection, this.seat, this.reservationTime);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
