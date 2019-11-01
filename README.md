# Selenium
## Test Automation  

 #### Selenium (WebDriver):

    . handel static dropDown
    . handel dynamic dropDown
    . practice with radio button
    . handel Auto sagestive
    . Assert.assert(false,true,eqouals)
    . Synchronization (implicit, explicit)and java(Thread.sleep( ))
    . Action class(Hover mouse)
    . Handel Frame and child windows
  ---- 
# Framworks

## 1- TestNg
    
    .@Test
    .Xml < suite, test, classes, class, methods => exclude ||include, packages, package />
    .@BeforeTest && @AfterTest
    .@BeforeSuite && @AfetrSuite
    .@BeforeMethod && @AfterMethod
    .@BeforeClass && @AfterClass
#### Attribute Helper:

    .@Test(grups={" "}),   In Xml => < groups && run => include || exclude />
    .@Test(dependsOnMethod={" "})
    .@Test(enabled= false || true)
    .@Test(timeOut=3000)
#### Parameterising:

    .@Parameters({" "}), In Xml => <parameter name=" " value=" " /> *folder level*
    .@Test(dataProvider=" ") => @DataProvider && Object[][]         *Mehtod level*
    
#### Listener: catch failed Test
    
    .implement interface listener class && in XML => <Listeners, Listener class-name=" " />
    
    .TestNg Report with Html file
    
    
## 2- Cucumber(Gherkin)

    .Dependencies and manage build path in Pom.Xml(https://mvnrepository.com/) Add JUnit/Selenium....


    