package org.example.selectors.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DifferentCSSSelectorsDemo {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        List<WebElement> allInputs = driver.findElements(By.cssSelector("input"));

        // 1. Locate by class name
        WebElement formSelect = driver.findElement(By.cssSelector(".form-select"));
        System.out.println("Located by class name: " + formSelect.getTagName());

        // 2. Locate by ID
        WebElement textInputById = driver.findElement(By.cssSelector("#my-text-id"));
        System.out.println("Located by ID: " + textInputById.getTagName());

        // 3. Locate by attribute
        WebElement textInputByAttribute = driver.findElement(By.cssSelector("input[myprop='myvalue']"));
        System.out.println("Located by attribute: " + textInputByAttribute.getTagName());

        // 4. Locate by tag and class
        WebElement fileInputByTagAndClass = driver.findElement(By.cssSelector("input.form-control[type='file']"));
        System.out.println("Located by tag and class: " + fileInputByTagAndClass.getTagName());

        // 5. Locate by multiple attributes
        WebElement colorPickerByMultipleAttributes = driver.findElement(By.cssSelector("input[type='color'][value='#563d7c']"));
        System.out.println("Located by multiple attributes: " + colorPickerByMultipleAttributes.getTagName());

        // 6. Locate by direct child
        WebElement directChildLabel = driver.findElement(By.cssSelector("div.col-md-4 > label.form-label"));
        System.out.println("Located by direct child: " + directChildLabel.getText());

        // 7. Locate by descendant
        WebElement descendantCheckboxLabel = driver.findElement(By.cssSelector("div.form-check .form-check-label"));
        System.out.println("Located by descendant: " + descendantCheckboxLabel.getText());

        // 8. Locate by nth-child
        WebElement secondCheckbox = driver.findElement(By.cssSelector("div.form-check:nth-child(2) .form-check-input"));
        System.out.println("Located by nth-child: " + secondCheckbox.getAttribute("name"));

        // 9. Locate by nth-of-type
        WebElement secondRadio = driver.findElement(By.cssSelector("div.form-check:nth-of-type(2) .form-check-input"));
        System.out.println("Located by nth-of-type: " + secondRadio.getAttribute("name"));

        // 10. Locate by partial attribute match
        WebElement datalistInput = driver.findElement(By.cssSelector("input[list^='my-']"));
        System.out.println("Located by partial attribute match: " + datalistInput.getAttribute("name"));
    }
}
