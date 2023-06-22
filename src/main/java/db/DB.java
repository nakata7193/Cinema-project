package db;

import models.Customer;
import models.Movie;
import models.Projection;
import models.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DB {
    private static final List<Reservation> reservationsDB = new ArrayList<>();

    public static List<Reservation> getData() {
        reservationsDB.clear();

        // Create sample customer
        Customer customer = new Customer();
        customer.setEmail("ivan@test.com");
        customer.setName("Ivan");

        // Create sample movie
        Movie movie = new Movie();
        movie.setTitle("Sample Movie");
        movie.setDuration(LocalTime.of(2, 30));

        // Create sample projection
        Projection projection = new Projection();
        projection.setProjectionDate(LocalDate.of(2018, 05, 11));
        projection.setProjectionTime(LocalTime.of(18, 30));
        projection.setProjectionRoom("Room 1");

        // Create sample reservation
        Reservation reservation = new Reservation();
        reservation.customer = customer;
        reservation.projection = projection;
        reservation.setSeat("A1");
        reservation.setReservationTime(LocalTime.of(17, 00));
        reservationsDB.add(reservation);

        return reservationsDB;
    }
}
