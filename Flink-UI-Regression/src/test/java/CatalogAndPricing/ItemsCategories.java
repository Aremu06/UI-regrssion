package CatalogAndPricing;

import AndroidPages.AddressPage;
import AndroidPages.HomePage;
import com.shaft.driver.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class ItemsCategories {
    private AndroidDriver driver;


    @Test
    public void searchItemsCategoryTest() throws SQLException {
        new AddressPage(driver).pressSelectAddressButton().fillAddress("Mittelstraße 20 13055");
        new HomePage(driver).SearchProducts("Apfel Golden Delicious Kl.I 1 Stk. (Italien)");
    }


    @BeforeMethod
    public void setup() {
        driver = (AndroidDriver) DriverFactory.getDriver();
    }

    @AfterMethod
    public void teardown() {
        DriverFactory.closeAllDrivers();
    }
}
