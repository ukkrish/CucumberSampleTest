package grp.stepdfns;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by krish on 24/01/2018.
 */
public class testTimer {

    @Given("^User opens the inbuilt Android Timer app $")
    public void user_opens_the_inbuilt_Android_Timer_app() throws Throwable {

        System.out.println(" TIMER - Given ");

    }

    @When("^User sets timer and taps on start button $")
    public void user_sets_timer_and_taps_on_start_button() throws Throwable {
        System.out.println(" TIMER - When ");
    }

    @Then("^the Timer starts counting down$")
    public void the_Timer_starts_counting_down() throws Throwable {
        System.out.println(" TIMER - Then .... ");
    }



}
