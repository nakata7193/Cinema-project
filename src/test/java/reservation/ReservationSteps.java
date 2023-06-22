package reservation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Customer;
import models.Movie;
import models.Projection;
import reservation.model.ReservationScreenModel;

import java.time.LocalDate;
import java.time.LocalTime;

import static junit.framework.TestCase.assertEquals;

public class ReservationSteps {
    private final ReservationScreenModel reservationScreenModel;
    private Movie movie;

    public ReservationSteps(ReservationScreenModel reservationScreenModel) {
        this.reservationScreenModel = reservationScreenModel;
    }

    @Given("a user with {string} email and {string} name has logged in")
    public void aUserHasLoggedIn(String email, String name) {
        var customer = new Customer();
        customer.setName(name);
        customer.setName(email);
        this.reservationScreenModel.addCustomer(customer);
    }

    @When("the user opens movie reservation screen")
    public void theUserOpensMovieReservationScreen() {
    }

    @When("the user selects {string} movie")
    public void theUserSelectsMovie(String title) {
        this.movie = new Movie();
        this.movie.setTitle(title);
    }

    @When("the user selects {string} room on {string} date at {string} o'clock")
    public void theUserSelectsMovie(String room, String date, String time) {
        var projection = new Projection();
        projection.setProjectionDate(LocalDate.parse(date));
        projection.setProjectionTime(LocalTime.parse(time));
        projection.setProjectionRoom(room);
        projection.movie = this.movie;
        this.reservationScreenModel.addProjection(projection);
    }

    @When("the user selects {string} seat")
    public void theUserSelectsSea(String seat) {
        this.reservationScreenModel.addSeat(seat);
    }

    @When("the user clicks on place button")
    public void theUserClicksOnPlaceButton() {
        this.reservationScreenModel.placeReservation();
    }

    @Then("{string} message is returned to the user")
    public void messageReturnedToUser(String message) {
        assertEquals(message, this.reservationScreenModel.getMessage());
    }
}
