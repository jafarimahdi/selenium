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
---
* __Methods:__

    `driver.getTitle()` `driver.getCurrentUrl()` `driver.getPageSource()` 

    `driver.close()` `driver.quit()`
* __Navigation Methods:__

    `driver.navigate().to("new url")` `driver.navigate().back()` `driver.navigate().forward()` `driver.navigate().refresh()`
---
* __Locator identifiers:__
    
    `driver.findElements(By. )`.className("") .TagName("")

    `driver.findElement(By. )`
        
       
     
|findElement(By.  ) | 2 Step                            |
| ----------------- |-----------------------------:     |
| By.Id("")         |.SendKeys(Keys.`any keyboard key`) |
| By.ClassName("")  |.SendKeys(" ") .getText()          |
| By.XPath("")      |.getText() .Click()   .clear()     |
| By.CssSelector("")|.size() get(index)
| By.LinkText("")   |
| By.Name("")       |
| By.TagName("")    |

---
#### __Regular Expression__ concept in dynamic Selecting ####

* __1-Realtive:__

    `Xpath `Regular Expression : //tagName[contains(@attribute, 'value')]  => //input[contains(@name,'userName')]

    `CssSelector ` Regular Expression : tagName[Attribute*='value'] =>
    input[name*='userName']

*   __2-Absolute:__

    `Parent child xpath` Html : //section/child/child/select

* __validation concept__ : check the select item is correct before run all Test in Chrome & FireFox
 `Console`:

   in console : `$x( Xpath )` || 
 `$( CssSelector )`

---
#### __DropDown :__ ####

* 1- __`Static dropDown`__  with __`Select()`__ class

```java
    Select item = new Select(driver.findElement(By.   ));

    item.selectByValue(""); || item.selectByIndex(); || item.selectByVisibleText("");
```

* 2a -__`Dynamic dropDown :`__ __index__

     If there is more than 1 dynamic dropDown for select the target in 2 dropDown you have to use the dropDown index [ ] also

* 2b -__`Dynamic dropDown :`__  __parent child relationShip__

     select directly dropDown and then select the target => parentXpath`+ space +`childXpath  (target)

* 3 -__`Auto suggestive dropDown :`__

    Test the auto Suggestive with methods: `sendkeys(key. )` `sendKeys("")` `clear()` `getText()`


---

* Assert.assert(false,true,equals)
*  Synchronization (implicit, explicit)and java(Thread.sleep( ))
*  Action class(Hover mouse)
*  Handel Frame and child windows
* handel Radio button
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


    