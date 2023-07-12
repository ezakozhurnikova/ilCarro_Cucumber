package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.CarWorkPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static com.ilCarro.pages.BasePage.driver;

public class CarWorkSteps {

    @And("User clicks Let the car work link")
    public void click_Let_the_car_work_link() {
        new CarWorkPage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User fills the form with valid data")
    public void fill_with_valid_data() {
        new CarWorkPage(driver).fillValidData();
    }

    @And("User clicks on Submit button")
    public void click_on_Submit_button() {
        new CarWorkPage(driver).clickOnSubmitButton();
    }

    @Then("User verifies Car added message")
    public void verify_Car_added_message() {
        new CarWorkPage(driver).isSubmitMessageDisplayed("Car added");
    }

}
