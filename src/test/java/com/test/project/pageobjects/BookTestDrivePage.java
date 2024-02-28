package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Instant;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfAllElementsLocatedBy;

public class BookTestDrivePage extends BaseClass {
    private final By headerBookTestDrive = By.xpath("//h1[normalize-space()='Book a Test Drive or Appointment']");
    private final By txtFirstName = By.id("input_first_name");
    private final By txtLastName = By.id("input_last_name");
    private final By txtEmailAddress = By.id("input_email_address");
    private final By ddCountryCode = By.xpath("//*[@class='iti__selected-flag']");
    private final By txtPhoneNo = By.id("input_phone_number");
    private final By dpPreferredDate = By.xpath("//input[@id='datepicker_preferred_date']");
    private final By ddPreferredTime = By.xpath("//div[6]/div/div[1]/div[1]/div/div");
    private final By ddPreferredSalesConsultant = By.xpath("//div[normalize-space()='Preferred sales consultant (optional)']");
    private final By ddNumberOfPax = By.xpath("//div[8]/div/div[1]/div[1]/div/div");

    private final By ddPreferredModel = By.xpath("//div[@role='combobox']//div[@class='choices__inner']");
    private final By ddTestDriveOptions = By.xpath("//div[@class='choices__item choices__placeholder choices__item--selectable'][normalize-space()='Select a test drive option']");
    private final By txtCurrentVehicleModel = By.id("input_vehicle_model");
    private final By txtYearOfVehicle = By.id("input_year_of_vehicle");
    private final By chkDrivingLicence = By.id("checkbox_driving_license");
    private final By chkPrivacyPolicy = By.xpath("//input[@id='checkbox_privacy_policy']");
    private final By chkMarketing = By.xpath("//input[@id='checkbox_marketing']");
    private final By btnSubmit = By.xpath("//div[@class='button__wrp inline']");

    public BookTestDrivePage(WebDriver driver) {
        super(driver);
    }

    public boolean showHeaderTextDisplayed() throws Exception {
        try {
            return driver.findElement(headerBookTestDrive).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterFirstName(String firstName) throws Exception {
        try {
            driver.findElement(txtFirstName).sendKeys(firstName);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterLastName(String lastName) throws Exception {
        try {
            driver.findElement(txtLastName).sendKeys(lastName);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterEmailAddress(String email) throws Exception {
        try {
            driver.findElement(txtEmailAddress).sendKeys(email);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectCountryCode(String countryCode) throws Exception {
        try {
            driver.findElement(ddCountryCode).click();
            List<WebElement> dpCountryCode = driver.findElements(By.xpath("//div[4]/div/div[1]/div/div/ul/li"));
            for (int i = 1; i < dpCountryCode.size(); i++)
            {
                if(dpCountryCode.get(i).getText().equals(countryCode)){
                    dpCountryCode.get(i).click();
                    break;
                }
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterPhoneNumber(String phoneNo) throws Exception {
        try {
            driver.findElement(txtPhoneNo).sendKeys(phoneNo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectPreferredDate() throws Exception {
        try {
            WebElement datePicker = driver.findElement(dpPreferredDate);
            datePicker.click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectPreferredMonth(String month) throws Exception {
        try {
            List<WebElement> dpMonth = driver.findElements(By.xpath("//*[@class=\"flatpickr-monthDropdown-month\"]"));
            for (int i = 1; i < dpMonth.size(); i++)
            {
                if(dpMonth.get(i).getText().equals(month)){
                    dpMonth.get(i).click();
                    break;
                }
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectPreferredDay(String day) throws Exception {
        try {
            List<WebElement> dpDay = driver.findElements(By.xpath("//div[2]/div/div[2]/div/span"));
            for (int j = 1; j < dpDay.size(); j++)
            {
                if(dpDay.get(j).getText().equals(day)){
                    dpDay.get(j).click();
                    break;
                }
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectPreferredTime(String time) throws Exception {
        try {
            driver.findElement(ddPreferredTime).click();
            List<WebElement> ddTime = driver.findElements(By.xpath("//div[6]/div/div[1]/div[2]/div/div"));
            for (int j = 1; j < ddTime.size(); j++)
            {
                if(ddTime.get(j).getText().equals(time)){
                    ddTime.get(j).click();
                    break;
                }
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectPreferredSalesConsultant() throws Exception {
        try {
            driver.findElement(ddPreferredSalesConsultant).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectNumberOfPax(String pax) throws Exception {
        try {
            driver.findElement(ddNumberOfPax).click();
            List<WebElement> ddPax = driver.findElements(By.xpath("//div[8]/div/div[1]/div[2]/div/div"));
            for (int j = 1; j < ddPax.size(); j++)
            {
                if(ddPax.get(j).getText().equals(pax)){
                    ddPax.get(j).click();
                    break;
                }
            }

        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectTestDriveOptions(String testOption) throws Exception {
        try {
            driver.findElement(ddTestDriveOptions).click();
            List<WebElement> ddTestOption = driver.findElements(By.xpath("//div[10]/div/div[1]/div[2]/div/div"));
            for (int j = 1; j < ddTestOption.size(); j++)
            {
                if(ddTestOption.get(j).getText().equals(testOption)){
                    ddTestOption.get(j).click();
                    break;
                }
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterCurrentVehicleModel(String model) throws Exception {
        try {
            driver.findElement(txtCurrentVehicleModel).sendKeys(model);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterYearOfVehicle(String yearVehicle) throws Exception {
        try {
            driver.findElement(txtYearOfVehicle).sendKeys(yearVehicle);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDrivingLicence() throws Exception {
        try {
            driver.findElement(chkDrivingLicence).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickPrivacyPolicy() throws Exception {
        try {
            driver.findElement(chkPrivacyPolicy).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickMarketing() throws Exception {
        try {
            driver.findElement(chkMarketing).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isSelectedCheckbox() throws Exception {
        try {
            return driver.findElement(chkMarketing).isSelected();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSubmit() throws Exception {
        try {
            driver.findElement(btnSubmit).click();
        } catch (Exception ex) {
            throw ex;
        }
    }
}
