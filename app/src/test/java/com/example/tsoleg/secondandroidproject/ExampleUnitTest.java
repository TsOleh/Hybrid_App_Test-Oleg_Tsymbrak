package com.example.tsoleg.secondandroidproject;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class ExampleUnitTest {
    AndroidDriver driver;
    static String NAME = "Oleh";
    static String ID_NAME = "Hello: Oleh";


    @Before
    public void setUp() throws Exception {
        final DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Nexus 4");
        cap.setCapability("platformVersion", "7.0");
        cap.setCapability("app", "C:\\Android_projects\\SecondAndroidProject\\app\\selendroid-test-app.apk");
        //capabilities.setCapability("app-package", "io.selendroid.testapp");
        //capabilities.setCapability("app-activity", ".HomeScreenActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @Test
    public void myTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
        driver.findElement(By.id("name_input")).clear();
        driver.findElement(By.id("name_input")).sendKeys(NAME);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Send me your name!\"]")).click();
        Assert.assertTrue("verify submit form ",
                driver.findElement(By.id(ID_NAME)).isEnabled());
    }

    @After
    public void close() {
        driver.quit();
    }
}