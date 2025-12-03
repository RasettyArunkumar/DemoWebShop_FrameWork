DemoWebShop Automation Framework
A robust Selenium WebDriver Automation Framework designed for testing the Demo Web Shop (E-commerce)  web  application.
This framework is built using Java, Maven, TestNG, Apache POI, and Extent Reports, following Page Object Model (POM) and supports Data-Driven Testing.
________________________________________
Project Overview
This automation framework validates the key modules of the DemoWebShop application such as:
•	 User Registration
•	 User Login
•	Add to Cart
•	 Wishlist
•	Checkout & Order Placement
•	 Search Functionality
•	 Logout
The framework ensures scalability, reusability, and easy maintenance.
________________________________________
Tech Stack
Component	Technology
Language	Java
Build Tool	Maven
Test Framework	TestNG
Design Pattern	Page Object Model (POM)
Reporting	Extent Reports
Test Data	Apache POI (Excel)
Logging	Log4j
Automation Tool	Selenium WebDriver
________________________________________
📁 Project Structure
DemoWebShop-Automation/
│
├ src/main/java/
├base/              --> Base classes, Driver initialization
├ pages/            --> All POM page classes
├ utils/            --> Utility class for reading Excel,properitis data, Apache POI

├src/test/java/
├ testcases/         --> All TestNG test scripts
├ testdata/          --> Excel files for DDT
├ reports/           --> Extent Report output
├ pom.xml            --> Maven dependencies
└ testng.xml         --> Test Suite configuration
________________________________________
 Features
	Page Object Model (POM)
•	Improved readability and maintainability
•	UI locators and methods organized per page
	Data-Driven Testing (Apache POI)
•	Read test data from Excel
•	Supports Valid & Invalid combinations
	TestNG Integration
•	Parallel execution
•	Grouping of test cases
•	TestNG listeners for enhanced reporting
✔️ Extent Reports
•	Beautiful HTML test reports
•	Screenshot attachment on failures
✔️ Reusable Utility Functions
•	WebDriver waits
•	Screenshot method
•	Excel reader
•	Config property reader

________________________________________
 How to Run the Tests?
 1. Clone the Repository
    git clone https://github.com/yourusername/ DemoWebShop_FrameWork.git
 2. Navigate into the Project
    cd DemoWebShop-Automation
 3. Install Dependencies
   mvn clean install
 4. Run Test Suite
    mvn test
   Or run:
    testng.xml
________________________________________
Reports
After execution, Extent Report will be available at:
/reports/Html_Report.html
Includes:
•	Test Status (Pass/Fail/Skip)
•	Execution Time
•	Screenshots for failures
•	Log details
________________________________________
 Test Data
Excel files are stored under:
/testdata/
Used for:
•	Registration module
•	Login module
•	End-to-end workflows
Apache POI reads data at runtime.
________________________________________
 Maven Dependencies Used
•	Selenium Java
•	TestNG
•	Apache POI
•	Extent Reports
•	Log4j 
________________________________________
 Sample Test Execution Flow
1.	Initialize WebDriver
2.	Load application URL
3.	Read data from Excel
4.	Execute test steps using POM
5.	Capture results & screenshots
6.	Generate Extent Reports
________________________________________
Contributing
Contributions are always welcome!
Feel free to raise issues or submit pull requests.
________________________________________
Contact
Your Name –Rasetty Arun Kumar
Email:rasettyarunkumar@gmail.com
GitHub: https://github.com/RasettyArunkumar 
LinkedIn: rasettyarunkumar

