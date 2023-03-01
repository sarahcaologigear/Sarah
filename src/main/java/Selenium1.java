import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium1 {
    public static ChromeDriver driver;
    static void quit()
    {
        driver.quit();
    }
    static void func_login_TC1()
    {
        driver.findElement(By.xpath("//input[@type='text']"));
        driver.findElement(By.xpath("//input[@type='password']"));
    }
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SATTDN23.01.02\\IdeaProjects\\Selenium1.1\\src\\main\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.railwayb2.somee.com/Account/Login.cshtml");
        quit();
        func_login_TC1();
    }


}

