package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SecondPage extends Form
{
    IElementFactory iElementFactory = AqualityServices.getElementFactory();
    private final By CaretechSupport= By.xpath("//*[@id=\"top_menu\"]/li[3]");
    private final IButton CaretechSupport_level = iElementFactory.getButton(CaretechSupport,"CaretechSupport Button");


    public SecondPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "IT service provider specialized")), "IT service provider specialized");
    }

    public void ClickCaretechSupport()
    {
        CaretechSupport_level.click();
    }
}
