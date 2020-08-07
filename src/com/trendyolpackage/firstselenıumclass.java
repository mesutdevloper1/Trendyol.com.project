package com.trendyolpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class firstselenıumclass {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:/Users/mstgl/Desktop/selenıum/selenıumdrıver/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // WebElement destekBtn=driver.findElement(By.className("user-navigation")).findElements(By.tagName("li")).get(0);
        //System.out.println( destekBtn.getText() );
      

       // WebElement destekBtn=driver.findElement(By.className("fancybox-item fancybox-close"));
       // System.out.println(destekBtn.getText());
       // destekBtn.click();
     driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div/div/div[2]/a/span[2]")).click();
     driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div[3]/div/div/ul/li[1]/div[1]/i")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/form/section[1]/div/input")).sendKeys("mstgltn6@gmail.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
   driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/form/section[2]/div/input")).sendKeys("Mesut1326520");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
   driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/form/div[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div/div[1]/svg")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //kadın
   driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement destekBtn=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[1]/a"));
        System.out.println( destekBtn.getText()+"kadın sayfasındasınız" );
//erkek
   driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn1=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[2]/a"));
        System.out.println( destekBtn1.getText()+"erkek sayfasındasınız" );
//erkek
   //cocuk
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[3]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn2=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[3]/a"));
        System.out.println( destekBtn2.getText()+"cocuk sayfasındasınız" );

        //ev yaşam
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[4]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn3=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[5]/a"));
        System.out.println( destekBtn3.getText()+"ev yaşam sayfasındasınız" );
        //süpermarket
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[5]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn8=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[5]/a"));
        System.out.println( destekBtn8.getText()+"süpermarket sayfasındasınız" );
        //kozmetik
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[6]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn4=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[7]/a"));
        System.out.println( destekBtn4.getText()+"kozmetik sayfasındasınız" );
        //ayakkabı canta
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[7]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn5=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[8]/a"));
        System.out.println( destekBtn5.getText()+"ayakkabı canta sayfasındasınız" );
        //saat&aksesur
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[8]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn6=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[9]/a"));
        System.out.println( destekBtn6.getText()+"saat&aksesur sayfasındasınız" );
        //elektronık
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[9]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement destekBtn7=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/nav/ul/li[10]/a"));
        System.out.println( destekBtn7.getText()+"elektronık sayfasındasınız" );
        //dell
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div/div/div[2]/div/a/img")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //ilk pc yı aç detaylara bak
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/div/img")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //sepete ekle butonu
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/div[1]/button[1]")).click();

            driver.quit();




    }
}
