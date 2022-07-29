package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Driver;

public class LinkomanijaLogIn {

    @BeforeMethod
    public void startUp(){
        Driver.setDriver();
        pages.linkomanijaLogIn.LinkomanijaLogIn.open();
    }
    @Test

    public void testLogInAndDownload (){
        String userName = "";
        String password = "";
        String searchText = "digimon";
        String themeMessage = "1";

        pages.linkomanijaLogIn.LinkomanijaLogIn.enterUserName(userName);
        pages.linkomanijaLogIn.LinkomanijaLogIn.enterPassword(password);
        pages.linkomanijaLogIn.LinkomanijaLogIn.clickPrisijungti();

        pages.linkomanijaLogIn.LinkomanijaLogIn.enterSearch(searchText);
        pages.linkomanijaLogIn.LinkomanijaLogIn.clickSearch();
        pages.linkomanijaLogIn.LinkomanijaLogIn.clickDownload();

        pages.linkomanijaLogIn.LinkomanijaLogIn.clickProfile();
        pages.linkomanijaLogIn.LinkomanijaLogIn.selectTheme(themeMessage);
        pages.linkomanijaLogIn.LinkomanijaLogIn.clickPatvirtinti();

    }
}
