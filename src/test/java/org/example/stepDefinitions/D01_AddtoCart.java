package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.AcademyBugsMainPage;
import org.testng.Assert;


public class D01_AddtoCart {
    AcademyBugsMainPage p01 = new AcademyBugsMainPage();
    @Given("user goto academybugs")
    public void usergotowebsite(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://academybugs.com/find-bugs/");
    }
    @When("the user adds the items to cart")
    public void useradditemstocart() throws InterruptedException {
        p01.addtocartbtn0().click();
        Thread.sleep(2000);
        p01.addtocartbtn1().click();
        Thread.sleep(2000);
        p01.addtocartbtn2().click();
        Thread.sleep(2000);
        p01.addtocartbtn3().click();
        Thread.sleep(2000);
        p01.addtocartbtn4().click();
        Thread.sleep(2000);
        p01.addtocartbtn5().click();
        Thread.sleep(2000);
        p01.addtocartbtn6().click();
        Thread.sleep(2000);
        p01.addtocartbtn7().click();
        Thread.sleep(2000);
        p01.addtocartbtn8().click();
        Thread.sleep(2000);
        p01.addtocartbtn9().click();
        Thread.sleep(2000);
        p01.addtocartbtn10().click();
        Thread.sleep(2000);
        p01.addtocartbtn11().click();
        Thread.sleep(2000);
        p01.addtocartbtn12().click();
        Thread.sleep(2000);
        p01.addtocartbtn13().click();
        Thread.sleep(2000);
    }
    @And("check whether all buttons are green colored and called checkout now")
    public void successbtnsassert() throws InterruptedException {
        Assert.assertTrue(p01.addtocartbtn0success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn1success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn2success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn3success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn4success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn5success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn6success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn7success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn8success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn9success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn10success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn11success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn12success().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(p01.addtocartbtn13success().isDisplayed());
        Thread.sleep(2000);
    }
    @Then("user clicks view cart")
    public void viewcartbtnclick(){
        p01.viewcartbtn().click();
    }
}
