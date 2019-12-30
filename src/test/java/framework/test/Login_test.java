package framework.test;

import com.framework.Base;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.testng.annotations.Test;
import po.Login;

public class Login_test extends Base {

    @Step("Enter valid Email address <emailAddressName>")
    public void enterEmailAddress(Table emailAddressName) throws InterruptedException {
        Thread.sleep(5000);
        Login login = new Login(driver);
        for (TableRow row : emailAddressName.getTableRows()) {
           // String emailAddress = row.getCell("email");
                String emailAddress = row.getCell("email");
                if (emailAddress.equals("gtl_test@thegatewaycorp.com")) {
                    login.emailBox_txt.sendKeys(emailAddress);
                }
        }
    }

    @Step("Enter valid Password <password>")
    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(5000);
        Login login = new Login(driver);
        login.passwordBox_txt.sendKeys(password);
    }

    @Step("Click on Sign In button and user successfully login")
    public void clickOnSignInButton() throws InterruptedException {
        Thread.sleep(5000);
        Login login = new Login(driver);
        login.signIn_btn.click();
        Thread.sleep(5000);
    }
}
