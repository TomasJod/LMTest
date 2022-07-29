package pages;

import org.openqa.selenium.By;

public class Locators {

    public static By inputLogInName = By.xpath("//*[@id = 'username']");
    public static By inputPassword = By.xpath("//*[@id = 'password']");
    public static By buttonPrisijungti = By.xpath("//*[@class = 'submit']");

    public static By fieldSearch = By.xpath("//*[@id='search']");
    public static By buttonSearch = By.xpath("//*[@id='searchsubmit']");
    public static By downloadFirst = By.xpath("//*[@id=\"content\"]/form/table[2]/tbody/tr[2]/td[2]/a[2]/img");

    public static By buttonProfilis = By.xpath("//*[@id=\"menu\"]/ul/li[3]");
    public static By selectTheme = By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td/form/table/tbody/tr[14]/td[2]/select");

    public static By buttonPatvirtinti = By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td/form/table/tbody/tr[28]/td/input[1]");
}
