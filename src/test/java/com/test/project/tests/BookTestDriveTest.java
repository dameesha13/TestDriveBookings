package com.test.project.tests;

import com.test.project.functions.BookTestDriveFunction;
import com.test.project.pageobjects.*;
import com.test.project.utils.JsonDataReader;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.test.project.utils.DriverSetup.setUp;

public class BookTestDriveTest extends JsonDataReader {

    static Logger log = Logger.getLogger(BookTestDriveTest.class);
    WebDriver driver;
    protected JSONObject data;
    private BookTestDrivePage bookTestDrivePage;
    private BookTestDriveFunction bookTestDriveFunction;

    /* Before Method*/
    @BeforeMethod
    public void beforeMethod() throws Exception {
        driver = setUp();
        bookTestDrivePage = new BookTestDrivePage(driver);
        bookTestDriveFunction = new BookTestDriveFunction(driver);
        envSetup();
    }

    private void envSetup() throws Exception {
        try {
            data = getJSONTestData();//read test data
        } catch (Exception ex) {
            throw ex;
        }
    }

    /* Req1: To Verify the Book Test Drive functionality */
    @Test
    public void verifyBookTestDriveFunctionality() throws Exception {
        try {
            bookTestDriveFunction.enterPersonalDetails((String) data.get("FirstName"),(String) data.get("LastName"), (String) data.get("EmailAddress"),(String) data.get("CountryCode"),(String) data.get("PhoneNumber"));
            bookTestDriveFunction.selectDatePicker((String) data.get("PreferredDay"), (String) data.get("PreferredMonth"), (String) data.get("PreferredYear"));
            bookTestDrivePage.selectPreferredTime((String) data.get("PreferredTime"));
            bookTestDrivePage.selectNumberOfPax((String) data.get("NumberOfPax"));
            bookTestDrivePage.selectTestDriveOptions((String) data.get("TestDriveOption"));
            bookTestDrivePage.clickPrivacyPolicy();
            bookTestDrivePage.clickMarketing();
            Assert.assertTrue(bookTestDrivePage.isSelectedCheckbox());
            //bookTestDrivePage.clickSubmit();
        } catch (Exception e) {
            log.info("verifyBookTestDriveFunctionality : FAIL");
            throw e;
        }
    }

    /* After Method*/
    @AfterMethod
    public void afterTest() {
        driver.close();
    }

}
