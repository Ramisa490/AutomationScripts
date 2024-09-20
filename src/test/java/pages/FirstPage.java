package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FirstPage extends Form
{
    IElementFactory iElementFactory = AqualityServices.getElementFactory();
    private final By CustomerPortal= By.xpath("//*[@id=\"page\"]/div[1]/div[2]/div/div/div/div[3]/div/div/div/a/span/span[2]");
    private final IButton CustomerPortal_level = iElementFactory.getButton(CustomerPortal,"Customer Portal Button");


    public FirstPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "IT service provider specialized")), "IT service provider specialized");
    }

    public void ClickCustomerPortal()
    {
         CustomerPortal_level.click();
    }


}
