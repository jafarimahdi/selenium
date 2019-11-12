# Test Automation  
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

`.get(url )` `.getTitle()` `.getCurrentUrl()` `.getPageSource()` `.getWindowsHandle()` `.getWindowsHandles()` `.switchTo()` `.navigate()` `.manage()`

`driver.close()` `driver.quit()`
* __Navigation Methods:__

    `driver.navigate().to("new url")` `driver.navigate().back()` `driver.navigate().forward()` `driver.navigate().refresh()`
---

### `Locator identifiers:` 
    
Single Target:`driver.findElement(By. )`&  Several Target:`driver.findElements(By. )`
        
[more..](http://onlinetraining.etestinghub.com/webdriver-methods-web-elements/)       
     
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

* __1-`implicit waite:`__

    Declare globally wait for n number seconds before throw exception or test fail and return result from Dom

```java
public class Tutorial{
    System.setProperty("webdriver.chrome.driver", "location file saved ");
    WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlywait(5,TimeUnit.SECONDS) //wait for 5 sec globally

}

```
* __2-`explicit waite :`__  `WebDriverWait( )` class

    Target specific element or scenario to wait for n number seconds before throw exception [check for more...](https://www.swtestacademy.com/selenium-webdriver-wait/)
```java
public class Tutorial{
    WebDriverWait waitHere = new WebDriverWait(driver, 20);

    waitHere.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(' ')));// just for this target

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
 
__Keyboard interface:__ ` sendKeys(keyToSend)` `keyDown(theKey)` `keyUp(theKey)`

__Mouse Interface:__ `click()`  `doubleClick()`  `contextClick()` `clickAndHold()` `dragAndDrop(source,target)` `dragAndDropBy(source,x-offset,y-offset)` `moveByOffset(x-offset,y-offset)` `moveToElement(toElement)` `release()` [more...](https://www.edureka.co/blog/keyboard-mouse-events-actions-class)

* __Hover Mouse__
* __double click__
* __right click__
* __Send Capital letter__

```java
public class ActMouseAndKey{

 driver.get('https://www.amazon.com');
 Actions a = new Actions(driver);
 WebElement target = driver.findElement(By.xpath(" "));

 a.moveToElement(target).build().perform(); //Hover
 a.moveToElement(target).doubleClick().build().perform();//doubleClick
 a.moveToElement(target).contextClick().build().perform();// right click
 a.moveToElement(target).click().keyDown(keys.SHIFT).sendKey('hello').build().perform();//send capital letter 'hello'

}
```
---
* __driver.SwitchTo() 📌:__

Moving to\between  __`windows/tabs`__, __`frames`__ or __`popUp`__ 

    1- driver.switchTo().alert()  //  popUp
    2- driver.switchTo()window()  //  getWindowHandle/Handles
    3- driver.switchTo()frame()   //  frame 

   [More..](https://www.toolsqa.com/selenium-webdriver/switch-commands/)

---
### `1- PopUp ` 

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
### 2- Handel child windows

* __`1- getWindowsHandles`__

```java
public class WindowsHandles{

    driver.findElement(By.xpath('')));// Target
    // when there is multiply tab\windows
    Set<String> allWindows = driver.getWindowHandles(driver); //catch all open Tab/Windows
    iterator<String> item = allWindows.iterator(); //interface iterator for collecting open windows/Tab in current browser 
    String parent = item.next(); // first Tab
    String child1 = item.next(); // second Tab
    String child2 = item.next(); // Third Tab

// after make it separate, switch and move between Tabs\Windows
    driver.switchTo().window(child1); // from parent to child1
    driver.switchTo().window(parent); // from child to parent
}
```
```java
public class WindowsHandle2{

    driver.findElement(By.xpath('')); //Target

     Set<String> allWindows = driver.getWindowsHandles(driver); //catch all Tabs
    ArrayList<String> listOfWindows = new ArrayList<>(allWindows);// convert Set to Array and use Array Methods
    // parent = listOfArray.get(0), child1 = listOfArray.get(1), child2 = listOfArray.get(2)

    //time to switch:
    driver.switchTo().window(listOfArray.get(2)); // switch to 2 child
    driver.switchTo().window(listOfArray.get(0)); // back to parent window again
}
```

* `2- getWindowHandle` 

___

### 3- Handel Frame :

```java
    driver.switchTo().frame(driver.findElement(By.)); // intro frame by locator
    driver.switchTo().frame(0) // intro frame by index

    //example: drag and drop By Actions inside of frame

    Actions a = new Actions(driver);
    a.dragAndDrop('from source locator','to target locater').build().perform();

    // back to parent Tab\Window from the Frame
    driver.switchTo()frame().defaultContent();
```

---
* handel Radio Button and checkBox
---- 

# __TestNg__
    

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
* `@Test(dataProvider=" ")` => @DataProvider && Object[ ][ ]         *Mehtod level*
    
### Listener: catch failed Test
    
implement interface listener class && in the XML => <Listeners, Listener class-name=" " />
    
`TestNg Report` with Html file
***    
    
    
##  __Cucumber(Gherkin)__

<image src="https://raw.githubusercontent.com/jafarimahdi/Test_Automation/master/pic/Cucumber.png" width=400>

* Add ` Dependencies ` from the [Mvnrepository](https://mvnrepository.com 'https:mvnrepository.com') in ` Pom.Xml ` and manage buildPath
    
### 1-Feature :


    Feature:

    Background:  when have same step in the scenario in one feature file we can use it

    1-Scenario:   ||  2-Scenario Outline:   Examples:

       Given:

       When:

       But:    

       And:
      
       Then:


---
### 2-Steps Class :
* Convert `.Feature` file with `Run Configurations` to `Steps.java` class

---
### 3- Runner Class : 
__Cucumber Option__


Make connection between `Steps` and `Feature` Part
 
    @RunWith(Cucumber.class)

    @CucumberOptions(features = {location where feature file saved}, 
    glue = {"CucumberFramework/steps" }, 
    monochrome = true, 
    tags = {}, 
    plugin = { "pretty", "html:target/cucumber",
	"json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html" })

 
---
 #### Trick ❗️

   * 1- Parametrization: `"valid"  & "invalid"`

         when we have the same step and just few step is different we use parametrization

  * 2- Data Tables (Structuring Our Test Data): ❗️in the __Steps Class__   __`\"([^\"*)\`__

        Have multiple data EX:'passwords/names/emails' and use the Row and Column to send/use one of them  

---

 #### Scenario Outline ❗️    In the .Feature    __`"<  >"`__

   where you want put the data use  "< >"


    Examples:

    |    url                   |userName     |   password |   message   |
    | www.webUniversity.com    | john Smit   |  1234567   | first user  |
    | www.someWebPage.com      |jeffry jason |  32758990  | second user | 
---

#### Hooks: 

    @Before() : before any method it run
    @After()  :  after all methods it run

---
### Tags

1- in the `Feature` file we can use `@SomeName` Tag ❗️ for one or more scenario or one Feature file 

2- and in the `Runner class` in `Tag{ @SomeName  }` we can mention it for running time

---
 
 #### XML

 36: for mange the Runner classes we can make xml file and use the all Runner Class easily

