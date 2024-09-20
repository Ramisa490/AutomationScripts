package stepdefinitions;

import pages.FirstPage;
import pages.SecondPage;
import pages.SuccessPage;
import pages.ThirdPage;
import utils.SettingsTestData;

public class Reused_Variables
{
    FirstPage firstPage = new FirstPage();
    SecondPage secondPage = new SecondPage();
    ThirdPage thirdPage = new ThirdPage();
    SuccessPage successPage = new SuccessPage();
    String name ="John Doe";
    String email="johndoe@gmail.com";
    String ref ="ref 1";
    String Desc = " ";



    protected  final String FileName = SettingsTestData.getFileData().getUploadFile();
    protected  final String FilePath = SettingsTestData.RESOURCE_FILE_PATH+FileName;

}
