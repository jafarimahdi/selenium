# Test Automation  
***


 ### Selenium (WebDriver) :

* Manage Selenium file to project

    * Add __Selenium__ `JRE` file to Library and download/manage __browser__ file to project and Import browser `Packege`
    ```java
    public class Tutorial{
        System.setProperty("webdriver.chrome.driver", "location file seved ");
    //  System.SetProperty("webdriver.gecko.driver","location file saved");

         WebDriver driver = new ChromeDriver();
    //  WebDriver driver = new FireFoxDriver();

        driver.get("www.example.com ");
        driver.getTitle();
    }
    ```
* Methods:

    `driver.getTitle()` `driver.getCurrentUrl()` `driver.getPageSource()` 
    `driver.close()` `driver.quit()`
* Navigation Methods:

    `driver.navigate().to("new url")` `driver.navigate().back()` `driver.navigate().forward()` `driver.navigate().refresh()`





* handel static dropDown
* handel dynamic dropDown
* practice with radio button
* handel Auto suggestive
* Assert.assert(false,true,equals)
*  Synchronization (implicit, explicit)and java(Thread.sleep( ))
*  Action class(Hover mouse)
*  Handel Frame and child windows
---- 
# Framworks:

## 1- TestNg
    
* `@Test `
* `Xml ` < suite, test, classes, class, methods => exclude ||include, packages, package />
* `@BeforeTest ` && ` @AfterTest`
* `@BeforeSuite ` && ` @AfterSuite`
* `@BeforeMethod ` && ` @AfterMethod`
* `@BeforeClass ` && ` @AfterClass`

#### Attribute Helper:

* `@Test(grups={" "})`,   In Xml => < groups && run => include || exclude />
* `@Test(dependsOnMethod={" "})`
* `@Test(enabled= false || true)`
* `@Test(timeOut=3000)`

#### Parameterising:

* `@Parameters({" "})`, In Xml => <parameter name=" " value=" " /> *folder level*
* `@Test(dataProvider=" ")` => @DataProvider && Object[][]         *Mehtod level*
    
### Listener: catch failed Test
    
implement interface listener class && in the XML => <Listeners, Listener class-name=" " />
    
`TestNg Report` with Html file
***    
    
    
## 2- Cucumber(Gherkin)

* Add ` Dependencies ` from the [Mvnrepository](https://mvnrepository.com 'https:mvnrepository.com') in ` Pom.Xml ` and manage buildPath
    
    * Make  ` Feature `  file 
        * Write  ` Scenario `     
        * `Given`
        * `When`
        * `But`
        * `Then`
        * `And`


    