# Test Automation  
***


 ### Selenium (WebDriver) 

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
### WebDriver Methods:
   __driver.__

`.get(url )` `.getTitle()` `.getCurrentUrl()` `.getPageSource()` `.getWindowsHandle()``.getWindowsHandles()` `.switchTo()` `.navigate()` `.manage()`

`driver.close()` `driver.quit()`
* __Navigation Methods:__

    `driver.navigate().to("new url")` `driver.navigate().back()` `driver.navigate().forward()` `driver.navigate().refresh()`
---

### `Locator identifiers:` 
    
Single Target:`driver.findElement(By. )`&  Several Target:`driver.findElements(By. )`
        
[Selenium(webDriver)  Methods](http://onlinetraining.etestinghub.com/webdriver-methods-web-elements/)       
     
|1- findElement(By.  )    | 2- Web operation on web elements |
| ----------------------- |--------------------------------: |
| By.Id("")               |.SendKeys(Keys.`keyboard key`)
| By.ClassName("")        |.SendKeys(" ")  continue()    
| By.XPath("")            |.Click( )  .clear( ) .isSelected( )
| By.CssSelector("")      |.getAttribute( ) .getTagName( )
| By.LinkText("")         |. getText( ) .getLocation( )
| By.Name("")             |.isDisplayed( ) .isEnabled( )
| By.TagName("")          |

---

### ` Regular Expression`   
__concept in dynamic Selecting__

* __1-Relative:__

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
### ` DropDown :`

* 1- __`Static dropDown`__  with __`Select()`__ class

```java
public class Tutorial{

    Select item = new Select(driver.findElement(By.   ));

    item.selectByValue(""); || item.selectByIndex(); || item.selectByVisibleText("");
}
```

* 2a -__`Dynamic dropDown :`__ __index__

     If there is more than 1 dynamic dropDown for select the target in 2 dropDown you can use the dropDown index [ ] also

* 2b -__`Dynamic dropDown :`__  __parent child relationShip__

     select directly dropDown and then select the target => parentXpath`+ space +`childXpath  (target)

* 3 -__`Auto suggestive dropDown :`__

    Test the auto Suggestive with methods: `sendkeys(key. )` `sendKeys("")` `clear()` `getText()`


---

### ` PopUp ` 

* 1- `javaScript popUp : ` Use ` SwitchTo().alert() ` Methods

    when you have popUp and you can't get any Html path or attribute for selecting

```java
public class Tutorial{
// after rich the website and have popUp

        driver.switchTo()alert().accept();   
// or   driver.switchTo().alert().dismiss();
//      driver.switchTo().alert().getText();    //text in the popup
//      driver.switchTo().alert().sendKeys(" "); and more ...

}
```
*  2- `Web related popUp :`

    just like normal case select the Target by: findElement(By. )
---

### `Assertions :`

Import TestNg JRE to Library or get Plugin 
* __`Assert.assertEquals(expect , actual )`__
* __`Assert.assertTrue(  )`__
* __`Assert.assertFalse( )`__
---
### `Handel Calender`

    How Select current day
    How Select future  day

---
### `Synchronization :`

* 1-__`implicit waite:`__

    Declare globally wait for n number seconds before throw exception or test fail and return result from Dom

```java
public class Tutorial{
    System.setProperty("webdriver.chrome.driver", "location file saved ");
    WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlywait(5,TimeUnit.SECONDS) //wait for 5 sec globally

}

```
* 2-__`explicit waite :`__  `WebDriverWait( )` class

    Target specific element or scenario to wait for n number seconds before throw exception [check for more and syntax...](https://www.swtestacademy.com/selenium-webdriver-wait/)
```java
public class Tutorial{
    WebDriverWait waitHere = new WebDriverWait(driver, 20);

    waitHere.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(' '))); // just for this target

//  waitHere.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath('')));
//  waitHere.until(ExpectedConditions.elementToBeClickable(BY.xpath('')));
//  waitHere.until(ExpectedConditions.presenceOfElementLocated(By.xpath('')));
    }
```
[More Methods...](https://selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html)

* 3-__`java: Thread.sleep( )`__

    Holding the test for n number of seconds 

    Thread.sleep(5000L);   // waiting for the 5 Seconds

---
### Actions:  
 class(Hover mouse)


---
*  Handel Frame and child windows
* handel Radio Button and checkBox
---- 

## 1- __TestNg__
    

* `@Test`
* `@BeforeMethod ` && ` @AfterMethod`
* `@BeforeClass ` && ` @AfterClass`
* `@BeforeTest ` && ` @AfterTest`
* `@BeforeSuite ` && ` @AfterSuite`
* `Xml ` < suite, test, classes, class, methods => exclude ||include, packages, package />

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


    