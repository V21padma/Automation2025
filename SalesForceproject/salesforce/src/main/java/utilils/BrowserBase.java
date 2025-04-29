package utilils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {
    WebDriver driver;

    public WebDriver browserBase() throws IOException {
        File f = new File("src/main/resources/Config/frameWorkconfiguration.properties");
        FileInputStream fis = new FileInputStream(f);
        Properties Prop = new Properties();
        Prop.load(fis);
        if (Prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (Prop.getProperty("browser").equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        } else if (Prop.getProperty("browser").equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }
        else {
            throw new InvalidArgumentException("Enter the valid browser");
    }
    driver.get(Prop.getProperty("environment"));
        return driver;
    }

    }