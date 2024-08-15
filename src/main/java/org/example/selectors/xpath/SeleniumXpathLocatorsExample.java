package org.example.selectors.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpathLocatorsExample {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // 1. Locate by tag name
        WebElement formSelect = driver.findElement(By.xpath("//select[@class='form-select']"));
        System.out.println("Located by tag name: " + formSelect.getTagName());

        // 2. Locate by ID
        WebElement textInputById = driver.findElement(By.xpath("//*[@id='my-text-id']"));
        System.out.println("Located by ID: " + textInputById.getTagName());

        // 3. Locate by attribute
        WebElement textInputByAttribute = driver.findElement(By.xpath("//input[@myprop='myvalue']"));
        System.out.println("Located by attribute: " + textInputByAttribute.getTagName());

        // 4. Locate by tag and class
        WebElement fileInputByTagAndClass = driver.findElement(By.xpath("//input[@class='form-control' and @type='file']"));
        System.out.println("Located by tag and class: " + fileInputByTagAndClass.getTagName());

        // 5. Locate by multiple attributes
        WebElement colorPickerByMultipleAttributes = driver.findElement(By.xpath("//input[@type='color' and @value='#563d7c']"));
        System.out.println("Located by multiple attributes: " + colorPickerByMultipleAttributes.getTagName());

        // 6. Locate by direct child
        WebElement directChildLabel = driver.findElement(By.xpath("//div[@class='col-md-4']/label[@class='form-label']"));
        System.out.println("Located by direct child: " + directChildLabel.getText());

        // 7. Locate by descendant
        WebElement descendantCheckboxLabel = driver.findElement(By.xpath("//div[@class='form-check']//label[@class='form-check-label']"));
        System.out.println("Located by descendant: " + descendantCheckboxLabel.getText());

        // 8. Locate by nth-child
        WebElement secondCheckbox = driver.findElement(By.xpath("//div[@class='form-check'][2]//input[@class='form-check-input']"));
        System.out.println("Located by nth-child: " + secondCheckbox.getAttribute("name"));

        // 9. Locate by nth-of-type
        WebElement secondRadio = driver.findElement(By.xpath("//div[@class='form-check'][2]//input[@type='radio']"));
        System.out.println("Located by nth-of-type: " + secondRadio.getAttribute("name"));

        // 10. Locate by partial attribute match
        WebElement datalistInput = driver.findElement(By.xpath("//input[starts-with(@list, 'my-')]"));
        System.out.println("Located by partial attribute match: " + datalistInput.getAttribute("name"));

        // Close the browser
        driver.quit();
    }
}
