package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilils.BrowserBase;

import java.io.IOException;

public class AmazonSteps
{
    WebDriver driver;
    WebElement catergoryDropdown;
@Given("user navigates to amazon homepage")
        public void amazonHomepage() throws IOException {
    BrowserBase b= new BrowserBase();
    driver = b.browserBase();  //return


        /*driver = new ChromeDriver();
        driver.get("https://www.amazon.in");*/

    }
    @When("user enter the search keyword {string}")
    public void EnterSearchKeyword(String prodname) {
        WebElement search= driver.findElement(By.xpath( "//input[@role=\"searchbox\"]"));
        search.sendKeys(prodname);
    }
    @And("user click the search icon")
    public void userClickTheSearchIcon() {
        driver.findElement(By.xpath( "//input[@type='submit']")).click();
    }
    @Then("verify the page title of the page")
    public void verifyThePageTitleOfThePage() {
     String title = driver.getTitle();
     System.out.println(title);
    }

    @When("user extracts the dropdown values")
    public void userExtractsTheDropdownValues() {
    catergoryDropdown = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
    int dropdownsize= catergoryDropdown.findElements(By.tagName("option")).size();
    System.out.println(dropdownsize);

    for (int i=0;i< dropdownsize;i++)
    {
        System.out.println(catergoryDropdown.findElements(By.tagName("option")).get(i).getText());
    }

    }

    @And("user select the value from the dropdown")
    public void selectValueFromDropdown() {
    Select s= new Select(catergoryDropdown);
    //s.selectByIndex(4);
    //s.selectByVisibleText("Deals");
    s.selectByValue("search-alias=mobile-apps");
    }

    @Then("user validates the dropdown values")
    public void userValidatesTheDropdownValues() {
    }

    @When("user clicks on baby wishlist")
    public void clicksBabyWishlist() {
     WebElement accountListSelection= driver.findElement(By.id("nav-link-accountList"));

     Actions action = new Actions(driver);
     action.clickAndHold(accountListSelection).build().perform();
     driver.findElement(By.linkText("Baby Wishlist")).click();
    }

    @Then("user validate the field name")
    public void validateFieldName() {
   //String text= driver.findElement(By.xpath( "[@class='a-spacing-none a-size-base-plus']")).getText();
        Assert.assertEquals("Your one-stop wishlist for all your baby and pregnancy needs.", driver.findElement(By.xpath( "//P[@class='a-spacing-none a-size-base-plus']")).getText());
}
}
