# Test Automation  
***


 ## __Selenium (WebDriver) :__

* Manage Selenium file to project

    * Add __Selenium__ `JRE` file to Library and download/manage __browser__ file to project and Import browser `Packege`
    ```java
    public class Tutorial{
        System.setProperty("webdriver.chrome.driver", "location file saved ");
    //  System.SetProperty("webdriver.gecko.driver","location file saved");

         WebDriver driver = new ChromeDriver();
    //  WebDriver driver = new FireFoxDriver();

        driver.get("www.example.com ");
        driver.getTitle();
    }
    ```
* __Methods:__

    `driver.getTitle()` `driver.getCurrentUrl()` `driver.getPageSource()` 

    `driver.close()` `driver.quit()`
* __Navigation Methods:__

    `driver.navigate().to("new url")` `driver.navigate().back()` `driver.navigate().forward()` `driver.navigate().refresh()`
* __Locator identifiers:__
    
    `driver.findElement(By. )`
        
       
     
|  1 Step           |  2 Step                       |
| ----------------- |:-----------------------------:|
| By.Id("")         | .SendKeys(" ")  .getText()    |
| By.ClassName("")  | .Click()
| By.XPath("")      |
| By.CssSelector("")|
| By.LinkText("")   |
| By.Name("")       |
| By.TagName("")    |


* __Regular Expression__ concept in Selecting

    `Xpath Regular Expression` : //tagName[contains(@attribute, 'value')]  => //input[contains(@name,'userName')]

    `CssSelector Regular Expression` : tagName[Attribute*='value'] =>
    input[name*='userName']




* handel static dropDown
* handel dynamic dropDown
* practice with radio button
* handel Auto suggestive
* Assert.assert(false,true,equals)
*  Synchronization (implicit, explicit)and java(Thread.sleep( ))
*  Action class(Hover mouse)
*  Handel Frame and child windows
---- 

## 1- __TestNg__
    

* `Xml ` < suite, test, classes, class, methods => exclude ||include, packages, package />
* `@Test`
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
    
    
## 2- __Cucumber(Gherkin)__

* Add ` Dependencies ` from the [Mvnrepository](https://mvnrepository.com 'https:mvnrepository.com') in ` Pom.Xml ` and manage buildPath
    
    * Make  ` Feature `  file 
        * Write  ` Scenario `     
        * `Given`
        * `When`
        * `But`
        * `Then`
        * `And`


    