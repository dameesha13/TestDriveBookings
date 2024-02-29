# Web UI Automation

This project encompasses automated test cases tailored for the site (https://www.lexus.com.sg/en/contact-us/book-a-test-drive.html?model=ux%20300e), enhancing its testing capabilities and ensuring robustness.

#### **Technology Stack**

 List of technologies used within the project,
* Java
* Selenium
* TestNG
* Maven
* Git

###### Checkout the branch
      git clone https://github.com/dameesha13/TestDriveBookings.git

###### Run the code using Maven goal

```
mvn clean install test -DsuiteXmlFile="BookTestDrive.xml" 
```

Project structure is as below.

``` bash
.
├── src
    ├── main
       ├── java
    ├── test
        ├── java
            ├── functions
            ├── pageobjects
            ├── tests
            ├── utils
        ├── resources
            ├── data #The test data files are located in this directory.
            ├── testng # TestNG xml files are located in src/test/resources/testng/ directory.
├── target
   ├── pom.xml
   ├── README.md 
