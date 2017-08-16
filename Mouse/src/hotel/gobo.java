import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class  {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.goibibo.com/");
        wd.findElement(By.xpath("//div[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/input")).click();
        wd.findElement(By.id("fare_20170816")).click();
        wd.findElement(By.xpath("//div[@id='searchWidgetCommon']/div/div[3]/div[1]/div[2]/div/input[1]")).click();
        wd.findElement(By.id("fare_20170914")).click();
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
