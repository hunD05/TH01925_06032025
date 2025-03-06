package com.example.th01925_ktnc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumWebDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testDangNhap() throws InterruptedException {
        //hien thi len trinh duyet
        driver.get("https://github.com");

        //dang nhap
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/header/div/div[1]/div[2]/a")).click();

        //truyen du lieu vao input
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("hungdm106@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("hung1062005");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]")).click();

        driver.quit();
    }


    @Test
    public void testDangKi() throws InterruptedException {
        //hien thi len trinh duyet
        driver.get("https://github.com");

        //chuyen form dang ki
        driver.findElement(By.xpath("//*[@id=\"FormControl--:Rjahb:\"]/div/button/span/span")).click();

        //nhap vao input
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hdm106@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("hung1062005");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("duongmanhhung2005");

        //continue
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/main/div/div[2]/div[2]/div/div[2]/div/form/div[3]/button/span")).click();
    }
}
