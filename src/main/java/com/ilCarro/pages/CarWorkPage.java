package com.ilCarro.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CarWorkPage extends BasePage {
    public CarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='navigation-link' and @id='1']")
    WebElement carWorkLink;

    public CarWorkPage clickOnLetTheCarWorkLink() {
        pause(2000);
        click(carWorkLink);
        return new CarWorkPage(driver);
    }

    public void fillValidData() {
        enterLocation("Tel aviv, Israel");
        enterManufacture("Audi");
        enterModel("XC60");
        enterYear("2019");
        enterFuel("Petrol");
        enterSeats("5");
        enterClass("Crossover");
        enterCarNumber("u7887");
        enterCarPrice("899");


    }

    @FindBy(id = "serialNumber")
    WebElement serialNumber;

    public CarWorkPage enterCarNumber(String number) {
        type(serialNumber, number);
        return this;
    }

    @FindBy(id = "price")
    WebElement carPrice;

    private CarWorkPage enterCarPrice(String price) {
        type(carPrice, price);
        return this;
    }

    @FindBy(id = "class")
    WebElement carClass;

    public CarWorkPage enterClass(String cl) {
        type(carClass, cl);
        return this;
    }

    @FindBy(id = "seats")
    WebElement carSeats;

    public CarWorkPage enterSeats(String seats) {
        type(carSeats, seats);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement carFuel;

    public CarWorkPage enterFuel(String fuel) {
        click(carFuel);
        carFuel.sendKeys(fuel);
        carFuel.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "year")
    WebElement carYear;

    public CarWorkPage enterYear(String year) {
        type(carYear, year);
        return this;
    }

    @FindBy(id = "model")
    WebElement carModel;

    public CarWorkPage enterModel(String model) {
        type(carModel, model);
        return this;
    }

    @FindBy(id = "make")
    WebElement manufacture;

    public CarWorkPage enterManufacture(String brand) {
        type(manufacture, brand);
        return this;
    }

    @FindBy(id = "pickUpPlace")
    WebElement location;

    public CarWorkPage enterLocation(String city) {
        type(location, city);
        pause(2000);
        location.sendKeys(Keys.DOWN);
        location.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitButton;

    public CarWorkPage clickOnSubmitButton() {
        click(submitButton);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement submitMessage;

    public CarWorkPage isSubmitMessageDisplayed(String message) {
        Assert.assertTrue(submitMessage.getText().contains(message));
        return this;
    }
}
