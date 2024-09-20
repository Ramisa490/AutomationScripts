package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SuccessPage extends Form
{
    IElementFactory iElementFactory = AqualityServices.getElementFactory();
    private final By Success= By.xpath("//*[@id=\"wrap\"]/div/div[2]/h1");
    private final IButton Success_msg = iElementFactory.getButton(Success,"Success Message");
    public SuccessPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "IT service provider specialized")), "IT service provider specialized");
    }
    public boolean isSuccessMessageDisplayed()
    {
        AqualityServices.getConditionalWait().waitFor(ExpectedConditions.visibilityOfElementLocated(Success),
                Duration.ofSeconds(120), Duration.ofMillis(300), "Element is not visible");

        return Success_msg.state().isDisplayed();
    }
}


