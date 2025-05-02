This is a sample project using Selenium-Java-TestNG
There is a Page Object Model framework with one page and one test class
To execute the same tests in parallel, using multiple browsers, a ThreadLocal object of WebDriver is used
The browser is identified from testng.xml before each test and each test runs in separate thread of its WebDriver instance
The project can be executed from testng.xml or using maven command "mvn clean test"
