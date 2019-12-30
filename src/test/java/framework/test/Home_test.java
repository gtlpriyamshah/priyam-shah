package framework.test;

import com.framework.Base;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import po.Home;

public class Home_test extends Base {



    @Step("Click on Login button and redirect to Login screen")
    public void loginBtn() throws InterruptedException {
        Thread.sleep(5000);
        Home home = new Home(driver);
        home.login_btn.click();
    }

}
