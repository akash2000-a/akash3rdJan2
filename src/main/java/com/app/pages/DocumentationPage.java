package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DocumentationPage {
    WebDriver driver;
    public DocumentationPage(WebDriver driver){
        this.driver=driver;
    }
    public void launchDocumentation(){
        String expectedtTitle= "The Selenium Browser Automation Project | Selenium";
        driver.findElement(By.linkText("Documentation")).click();
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedtTitle,"Documentation page not loaded");
    }
//    public void verifyDocumentationHeader(){
//        String expectedHeader= "Downloads";
//        String actualheader= driver.findElement(By.xpath("//h1[contains(text(),'Downloads')]")).getText();
//        Assert.assertEquals(actualheader,expectedHeader,"Header not loaded");
//    }
}
