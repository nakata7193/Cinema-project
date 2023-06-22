package models;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 */
public class Reservation {

    /**
     *
     */
    public Customer customer;
    /**
     *
     */
    public Projection projection;
    /**
     *
     */
    private String seat;
    /**
     *
     */
    private LocalTime projectionTime;

    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     *
     */
    // add get and set for seat and projectionTime
    public LocalDate getReservationTime() {
        // TODO implement here
        return null;
    }

    /**
     * @param ReservationTime
     */
    public void setReservationTime(LocalTime ReservationTime) {
        // TODO implement here
    }

    public String getSeat() {
        // TODO implement here
        return null;
    }

    /**
     * @param seat
     */
    public void setSeat(String seat) {
        // TODO implement here
    }


}