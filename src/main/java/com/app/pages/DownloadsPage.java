package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DownloadsPage {
    WebDriver driver;
    public DownloadsPage(WebDriver driver){
        this.driver=driver;
    }
    public void launchDownloads(){
        String expectedtTitle= "Downloads | Selenium";
        driver.findElement(By.linkText("Downloads")).click();
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedtTitle,"Downloads page not loaded");
    }
    public void verifyDownloadHeader(){
        String expectedHeader= "Downloads";
        String actualheader= driver.findElement(By.xpath("//h1[contains(text(),'Downloads')]")).getText();
        Assert.assertEquals(actualheader,expectedHeader,"Header not loaded");
    }
}
