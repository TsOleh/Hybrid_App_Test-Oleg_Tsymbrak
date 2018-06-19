package com.example.tsoleg.secondandroidproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

import io.appium.java_client.AppiumDriver;

public class ExampleUnitTest {
    AppiumDriver driver;


    @Before
    public void setUp() throws Exception {
        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "selendroid");
        capabilities.setCapability("deviceName", "Nexus 4");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "C:\\Android_projects\\SecondAndroidProject\\app\\selendroid-test-app.apk");
//        capabilities.setCapability("app-package", "io.appium.android.apis");
//        capabilities.setCapability("app-activity", "io.appium.android.apis.ApiDemos");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void myTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
        driver.findElement(By.id("name_input")).clear();
        driver.findElement(By.id("name_input")).sendKeys("Oleh");
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Send me your name!\"]")).click();
    }

    @After
    public void close() {
     driver.quit();
    }
}