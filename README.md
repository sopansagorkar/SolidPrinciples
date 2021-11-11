# SolidPrinciples

## Principle 1: Single Responsibility Principle (SRP)


A class should have one, and only one, reason to change.In other words to achieve this, a class should only have a single responsibility and it should do that very well. Every class in your automation should only have a single responsibility and that all of its methods should be aligned with that responsibility.


Let’s try to understand this principle by looking at an example from our daily life. When you are driving a car/bike, you want to fully concentrate on the single responsibility – driving. You don’t want to do or concentrate on other tasks like talking on a phone, eating.

 

### Automation Examples:


a) Page Object Framework implements SRP very well. We are going to have one class responsible for only one web page in the application. We shouldn’t have a very big class with many responsibilities like test methods, UI action methods, excel read/write methods.


b) We can have very specific helper classes like ExcelHelper, DatabaseHelper to work with a excel file or database to implement Data Driven Framework.


c) Selenium API has browser specific driver classes like FirefoxDriver, ChromeDriver, InternetExplorerDriver. FirefoxDriver has single responsibility to drive the Firefox browser and it drives the Firefox browser very well.


We should also have methods in classes that are very specific like loginAs(username, password) to login with given username and password,

testSuccessfulLogin (username,password) which tests only one thing that login should be successful with valid username/password.

 

## Principle 2: Open Closed Principle (OCP)


Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification


You should be able to easily add additional functionality for a class without changing its code. OCP says that a class should be open for extension and closed for modification. The “closed” part of the rule states that once a class has been developed and tested, the class code shouldn’t change except for any bug fixes. The “open” part of the rule states that you should be able to extend existing code in order to introduce new functionality. We are trying to add new functionality without modifying the existing code/functionality and by adding new classes/code as required. This is very important to minimise the impact of changes and errors from existing code.


Let’s try to understand this principle by looking at an example from our daily life. Let’s say you live in a 2 bedroom house and you are looking for a 3 bedroom house due to reasons like growing children. If you have free/unused space available, it’s very easy to extend the house by building another bedroom. Also with this, you are minimise the impact of changes on the existing 2 bedroom house.


### Automation Example:


Let’s say that you are automating an online store application. You have Customer class to represent store customers and respective related customer actions. Now, your company has introduced VIP customer concept to reward loyal customers with discounts and free delivery. To implement VIP customer behaviour in your automation, OCP suggests that keep the Customer class same without modifying it and create a new VipCustomer class by inheriting from Customer class. Now in the VipCustomer class extend the behaviour as required.



## Principle 3: Liskov Substitution Principle (LSP)


Subtypes must be substitutable for their base types


When you pass subtype for a base type argument or when you assign/instantiate base type with subtype, the program/code should work properly without changing its behaviour and shouldn’t break. This principle was introduced by and named after Barbara Liskov.


Let’s try to understand this principle by looking at an example from our daily life. Let’s say that you have a wall clock at home or you have a wrist watch. They both need batteries to work. If you buy batteries as per the specifications from any brand like Panasonic, Sony, Duracell, you expect the wall clock or wrist watch to work properly without any issues when powered by those batteries.


### Automation Example:


Considering the above example of automating an online store application with Customer and VIP Customer categories, let’s say there is a method calculateDeliveryCharge(Customer customer, OrderInfo orderInfo) which calculates delivery charge when customer and order information is passed. When we pass Customer object to calculateDeliveryCharge() method with order information, it should return delivery charge. Note that we are providing free delivery to VIP Customers. So, when we pass VipCustomer object for customer argument to calculateDeliveryCharge() method with order information, the program/code should work properly without changing its behaviour and shouldn’t throw any exceptions.


## Principle 4:Interface Segregation Principle (ISP)


Make fine grained interfaces that are client specific


It’s good to have small role specific interfaces rather than one big general interface. ISP states that clients should never be forced to implement interfaces that they don’t use or clients should never be forced to depend on methods that they don’t use. When a class depends upon another class, the number of members visible from the another class to the dependent class should be minimised. When you apply the ISP, classes implement multiple smaller role specific interfaces and dependent classes depend on required role specific interfaces for the given task.


Let’s try to understand this principle by looking at an example from our daily life. When you are travelling in a train and when ticket inspector wants to check your ticket, you will be showing only your ticket and not all your luggage. Similarly, ticket inspector wants to check your ticket only and not any other belongings of you. We should reveal/expose only what’s required for the given task.


### Automation Example:


Selenium API has good examples of ISP. Selenium API has a number of very fine grained, role based client specific interfaces like WebDriver, WebElement, Alert. We should favour role based interfaces instead of generic interfaces.


## Principle 5: Dependency Inversion Principle (DIP)


Depend on abstractions, not on concretions


DIP states that Software entities (classes, modules, functions, etc.) should depend on abstractions (like interfaces) and not on concretions (like concrete class types). DIP promotes code to an interface approach. For example, in Selenium automation code, we code to a WebDriver interface variable “driver” whenever we want to work with web browser and the same code works for any browser type like FirefoxDriver, ChromeDriver, InternetExploerDriver which implements the WebDriver interface.


DIP mainly suggests below 2 rules:

High level modules should not depend upon low level modules. Both should depend upon abstractions.

Abstractions should not depend upon details. Details should depend upon abstractions.


Let’s try to understand this principle by looking at an example from our daily life. When you go to a cash machine/ATM, the cash machine/ATM expects a valid debit/credit card. The machine has a dependency on valid card abstraction and not on specific concrete type cards like only Visa, only Maestro or only issued by specific bank. The machine works for any valid card type implementation and we are providing the card to the machine from outside which provides so much flexibility and easiness to use the machine.


### Automation Example:


Look at below page object for Login Page


public class LoginPage

{ 

	private WebDriver driver;


	public LoginPage(WebDriver driver)

	{

	  this.driver = driver;

	}


	public UserWelcomePage loginAs(String username, String password)

	{

	  driver.findElement(By.id("username")).sendKeys(username);

 	  driver.findElement(By.id("password")).sendKeys(password);

	  driver.findElement(By.name("login")).click();


	 return new UserWelcomePage(driver):

	}

}


We can observe following with respect to DIP from above LoginPage class:

It is depending on the abstraction and all the code is written against WebDriver interface so that the code can work with any implementation like FirefoxDriver, ChromeDriver, InternetExploerDriver


The implementation for the WebDriver interface should be passed by the client through constructor LoginPage(WebDriver driver) when creating the LoginPage object.


So the code works for any implementation and we can pass the implementation when creating the object. This gives us lot of flexibility and it will be easy to maintain.
