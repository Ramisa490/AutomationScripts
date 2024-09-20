package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ThirdPage extends Form
{
    IElementFactory iElementFactory = AqualityServices.getElementFactory();
    private final By Name= By.id("omsovbrav28i");
    private final ITextBox Name_level = iElementFactory.getTextBox(Name,"Enter Name");
    private final By Email= By.id("o2gvrojk2xwy");
    private final ITextBox Email_level = iElementFactory.getTextBox(Email,"Enter Email");
    private final By Reference = By.id("ohe9wrulxa75");
    private final ITextBox Reference_level = iElementFactory.getTextBox(Reference,"Enter Reference");
    private final By Description= By.id("o2z9gptewxq1");
    private final ITextBox Description_level = iElementFactory.getTextBox(Description,"Enter Description");
    private final By File= By.id("ose5zfgi76c");
    private final ITextBox File_level = iElementFactory.getTextBox(File,"Choose File");
    private final By Submit= By.xpath("//*[@id=\"wrap\"]/section[2]/div/form/div/div[7]/a");
    private final IButton Submit_level = iElementFactory.getButton(Submit,"Click on the Submit Button");




    public ThirdPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "IT service provider specialized")), "IT service provider specialized");
    }

    public void EnterName(String name)
    {
        Name_level.sendKeys(name);
    }

    public void EnterEmail(String Email)
    {
        Email_level.sendKeys(Email);
    }

    public void EnterReference(String reference)
    {
        Reference_level.sendKeys(reference);
    }

    public void EnterDescription(String description)
    {
        Description_level.sendKeys(description);
    }

    public void ChooseFile(String FileName)
    {
        File_level.clearAndType(FileName);

    }
    public void Submit ()
    {
        Submit_level.click();
    }

}
