package example;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;


public class App
{

    // Detaylandırmak için @after @before komutları yerine manuel start/quit yazılmıştır

    @Test
    public void Test1(){
        WebDriver driver = new ChromeDriver();


        driver.get("https://magento.softwaretestingboard.com/");


        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("ahmetkrcc@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("Karci.0033");


        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();
        driver.quit();

    }
    @Test
    public void Test2() {

        // WebDriver'ı başlat
        WebDriver driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");


        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();


        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));


        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys("");
        passwordField.sendKeys("");
        driver.findElement(By.id("send2")).click();

        // Hata mesajını kontrol et
        try {
            WebElement errorMessageElement = driver.findElement(By.className("message-error"));
        } catch (org.openqa.selenium.NoSuchElementException e) {

            return;
        } driver.quit();
    }


   @Test
        public void Test3() {

            WebDriver driver = new ChromeDriver();

            driver.get("https://magento.softwaretestingboard.com/");


            WebElement signInButton = driver.findElement(By.linkText("Sign In"));
            signInButton.click();

            WebElement usernameField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));


            usernameField.sendKeys("ahmetkrcc@gmail.com");
            passwordField.sendKeys("yanlış");


            driver.findElement(By.id("send2")).click();


            WebElement errorMessageElement = driver.findElement(By.className("message-error"));
            String errorMessage = errorMessageElement.getText();

       driver.quit();
        }
    @Test
    public void Test4() {
        // fail olan test !!!!!!!!!!!
        WebDriver driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");


        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();

        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));


        usernameField.sendKeys("deneme@deneme.com");
        passwordField.sendKeys("deneme");


        driver.findElement(By.id("send2")).click();


        WebElement errorMessageElement = driver.findElement(By.className("message-error"));





        driver.quit();
    }

    @Test
    public void Test5() {
// create an account test

        WebDriver driver = new ChromeDriver();

        // Siteye git
        driver.get("https://magento.softwaretestingboard.com/");


        WebElement createAccountLink = driver.findElement(By.linkText("Create an Account"));
        createAccountLink.click();


        driver.findElement(By.id("firstname")).sendKeys("Deneme");
        driver.findElement(By.id("lastname")).sendKeys("Deneme");
        driver.findElement(By.id("email_address")).sendKeys("Testqa@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Testqa.123");
        driver.findElement(By.id("password-confirmation")).sendKeys("Testqa.123");


        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();



        driver.quit();


    }


    @Test
    public void Test6() {
// create an account test

        WebDriver driver = new ChromeDriver();


        driver.get("https://magento.softwaretestingboard.com/");


        WebElement createAccountLink = driver.findElement(By.linkText("Create an Account"));
        createAccountLink.click();





        WebElement firstnameField = driver.findElement(By.id("firstname"));
        WebElement lastnameField = driver.findElement(By.id("lastname"));
        WebElement emailAddressField = driver.findElement(By.id("email_address"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement passwordconField = driver.findElement(By.id("password-confirmation"));


        firstnameField.clear();
        lastnameField.clear();
        emailAddressField.clear();
        passwordField.clear();
        passwordconField.clear();
        firstnameField.sendKeys("");
        lastnameField.sendKeys("");
        emailAddressField.sendKeys("");
        passwordField.sendKeys("");
        passwordconField.sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();



        try {
            WebElement errorMessageElement = driver.findElement(By.className("message-error"));
        } catch (org.openqa.selenium.NoSuchElementException e) {

            return;
        }

        driver.quit();
    }
    @Test
    public void Test7() {
// Home page Timeout ' a takılmazsa başarı passes veren takılırsa fail veren test

        WebDriver driver = new ChromeDriver();


        driver.get("https://magento.softwaretestingboard.com/");


        try {

            driver.get("https://example.com");


            WebElement yogaButton = driver.findElement(By.xpath("//button[contains(text(),'Shop New Yoga')]"));

            if (yogaButton.isDisplayed()) {
                System.out.println("'Shop New Yoga' butonu bulundu.");
            } else {
                System.out.println("'Shop New Yoga' butonu bulunamadı.");
            }
        } catch (Exception e) {
            System.out.println("Hata oluştu: " + e.getMessage());

        }
        driver.quit();
    }
    @Test
    public void Test8() {
        // WebDriver'ı başlat
        WebDriver driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");


        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();

        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));


        usernameField.sendKeys("ahmetkrcc@gmail.com");
        passwordField.sendKeys("yanlış");


        driver.findElement(By.id("send2")).click();


        WebElement errorMessageElement = driver.findElement(By.className("message-error"));
        String errorMessage = errorMessageElement.getText();

        driver.quit();
    }
    @Test
    public void Test9() {
        // fail olan test !!!!!!!!!!!
        WebDriver driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");


        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();

        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));


        usernameField.sendKeys("deneme@deneme.com");
        passwordField.sendKeys("deneme");


        driver.findElement(By.id("send2")).click();


        WebElement errorMessageElement = driver.findElement(By.className("message-error"));

        driver.quit();

    }

    @Test
    public void Test10() {
// create an account testi

        WebDriver driver = new ChromeDriver();

        // Siteye git
        driver.get("https://magento.softwaretestingboard.com/");


        WebElement createAccountLink = driver.findElement(By.linkText("Create an Account"));
        createAccountLink.click();


        driver.findElement(By.id("firstname")).sendKeys("Deneme");
        driver.findElement(By.id("lastname")).sendKeys("Deneme");
        driver.findElement(By.id("email_address")).sendKeys("Testqa@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Testqa.123");
        driver.findElement(By.id("password-confirmation")).sendKeys("Testqa.123");


        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();



        driver.quit();


    }


    @Test
    public void Test11() {
// create an account testi

        WebDriver driver = new ChromeDriver();


        driver.get("https://magento.softwaretestingboard.com/");


        WebElement createAccountLink = driver.findElement(By.linkText("Create an Account"));
        createAccountLink.click();





        WebElement firstnameField = driver.findElement(By.id("firstname"));
        WebElement lastnameField = driver.findElement(By.id("lastname"));
        WebElement emailAddressField = driver.findElement(By.id("email_address"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement passwordconField = driver.findElement(By.id("password-confirmation"));


        firstnameField.clear();
        lastnameField.clear();
        emailAddressField.clear();
        passwordField.clear();
        passwordconField.clear();
        firstnameField.sendKeys("");
        lastnameField.sendKeys("");
        emailAddressField.sendKeys("");
        passwordField.sendKeys("");
        passwordconField.sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();



        try {
            WebElement errorMessageElement = driver.findElement(By.className("message-error"));
        } catch (org.openqa.selenium.NoSuchElementException e) {

            return;
        }

        driver.quit();
    }
    @Test
    public void Test12() {
// Arama butonuna data da bulunmayan veya yanlış veri girişi kontrolü

        WebDriver driver = new ChromeDriver();


        driver.get("https://magento.softwaretestingboard.com/");

        WebElement searchBox = driver.findElement(By.id("search"));
        String searchTerm = "bu veri yanlış";
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.ENTER);


        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Your search returns no results.";
        driver.quit();
    }

    }












