package stepDefinations;

import base.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObject.GooglePageObject;

public class GoolgeSearchSteps extends BaseClass {
    GooglePageObject googlePageObject;

    @Before
    public void init() {
        googlePageObject = PageFactory.initElements(driver, GooglePageObject.class);
    }

    @Given("I go to {string}")
    public void i_go_to(String string) {
        executeBrowser(string);
    }

    @Given("I put {string} in the search box")
    public void i_put_in_the_search_box(String string) {
        googlePageObject.setInputField(string);
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        googlePageObject.clickOnSearch();
    }

    @Then("I should see all the related results")
    public void i_should_see_all_the_related_results() {
        String str = googlePageObject.getResult();
//        Assert.assertEquals("demo", str);
    }

    @And("I close the browser")
    public void i_close_the_browser() {
        quiteBrowser();
    }
}
