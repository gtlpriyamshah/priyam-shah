package po;

import com.framework.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {

    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox_txt;

    @FindBy(xpath = "//*[@id='passwd']")
    public WebElement passwordBox_txt;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    public WebElement signIn_btn;
}
