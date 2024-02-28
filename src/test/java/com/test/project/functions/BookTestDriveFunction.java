package com.test.project.functions;

import com.test.project.pageobjects.BookTestDrivePage;
import org.openqa.selenium.WebDriver;

public class BookTestDriveFunction {
    private final BookTestDrivePage bookTestDrivePage;

    public BookTestDriveFunction(WebDriver driver) {

        bookTestDrivePage = new BookTestDrivePage(driver);
    }

    public void enterPersonalDetails(String firstName, String lastName, String email, String countryCode, String phoneNo) throws Exception {
        try {
            bookTestDrivePage.enterFirstName(firstName);
            bookTestDrivePage.enterLastName(lastName);
            bookTestDrivePage.enterEmailAddress(email);
            bookTestDrivePage.selectCountryCode(countryCode);
            bookTestDrivePage.enterPhoneNumber(phoneNo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectDatePicker(String day, String month, String year) throws Exception {
        try {
            bookTestDrivePage.selectPreferredDate();
            bookTestDrivePage.selectPreferredMonth(month);
            bookTestDrivePage.selectPreferredDay(day);
        } catch (Exception ex) {
            throw ex;
        }
    }


}
