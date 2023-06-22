package controller;

import models.Customer;
import models.Projection;
import models.Reservation;

import java.time.LocalTime;
import java.util.List;


public class ReservationController {
    public static String place(Customer customer, Projection projection, String seat, LocalTime reservationTime) {
        List<Reservation> ReservationsDB = db.DB.getData();

        if (ReservationsDB.stream().anyMatch(reservation -> reservation.getSeat().equals(seat))) {
            return "Already reserved seat!";
        }

        if (reservationTime.isAfter(projection.getProjectionTime().minusMinutes(60))) {
            return "Reservation must be placed at least 60 minutes before movie starts.";
        }

        Reservation reservation = new Reservation();
        reservation.customer = customer;
        reservation.projection = projection;
        reservation.setSeat(seat);
        reservation.setReservationTime(reservationTime);
        ReservationsDB.add(reservation);

        return ReservationsDB.add(reservation) ? "Successful reservation!" : "Reservation failed!";
    }
}
