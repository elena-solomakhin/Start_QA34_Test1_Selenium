import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;//create some web driver
    @Test
    public void start(){
        wd=new ChromeDriver();// define which specifically WD
    //    wd.get("https://contacts-app.tobbymarshall815.vercel.app/login"); dont remember history
   wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
   wd.navigate().back();
   wd.navigate().forward();
   wd.navigate().refresh();
   //wd.close();//close only tab
   wd.quit();// close all tabs
    }

    @Test
        public void LogoTest(){
            wd=new ChromeDriver();
            wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        //click login- open form
        WebElement loginTab= wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        //fill valid email
        WebElement emailTextBox=wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("noa1@gmail.com");
        //fill valid passowrd
        WebElement passwordTextBox= wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("qqQQ1234$");
        WebElement loginButton=wd.findElement(By.cssSelector("button"));
//      List <WebElement>list =wd.findElements(By.cssSelector("button"));
//      list.get(2).click();
        loginButton.click();
        // fill login button
        //Assert
        }
    @Test
    public void RegistrTest(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        //click login- open form
        WebElement loginTab= wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        //fill valid email
        WebElement emailTextBox=wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("romap7@gmail.com");
        //fill valid passowrd
        WebElement passwordTextBox= wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("qqQQ1234$");
        List<WebElement> list =wd.findElements(By.cssSelector("button"));
      list.get(1).click();
      //from here script don't work
      //WebElement signOut= wd.findElement(By.cssSelector(".navbar-logged_nav__2Hx7M button"));
       // "button:last-child"
     // signOut.click();

      //second variant
        // WebElement registr= wd.findElement(By.cssSelector(".login_login__3EHKB>button:last-child"));
      //  WebElement registr= wd.findElement(By.cssSelector("button:last-child"));
        //   registr.click();
        wd.quit();
    }
    @Test
    public void firstRegistrTest() {
    }
}
