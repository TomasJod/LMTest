package pages.linkomanijaLogIn;

import pages.Common;
import pages.Locators;

public class LinkomanijaLogIn {

    public static void open(){
        Common.openUrl("https://www.linkomanija.net/login.php");
    }


    public static void enterUserName (String userName){
        Common.sendKeysToElement(Locators.inputLogInName, userName);
    }
    public static void enterPassword (String password){
        Common.sendKeysToElement(Locators.inputPassword, password);
    }
    public static void clickPrisijungti (){
        Common.clickElement(Locators.buttonPrisijungti);
    }
    public static void enterSearch (String search){
        Common.sendKeysToElement(Locators.fieldSearch, search);
    }
    public static void clickSearch (){
        Common.clickElement(Locators.buttonSearch);
    }
    public static void clickDownload(){
        Common.clickElement(Locators.downloadFirst);
    }
    public static void clickProfile (){
        Common.clickElement(Locators.buttonProfilis);
    }
    public static void selectTheme (String value){
        Common.selectOptionByValue(Locators.selectTheme, value);
    }
    public static void clickPatvirtinti(){
        Common.clickElement(Locators.buttonPatvirtinti);
    }
}
