package test;

import org.testng.annotations.Test;
import pages.EntityPage;
import pages.LoginPage;

public class IndividualDetailsTest extends TestBase {

    LoginPage loginPage= new LoginPage();
    EntityPage entityPage= new EntityPage();

    @Test
    public void testFirstNameWithCharacters(){

        loginPage.login();
        entityPage.fillEntity();



    }

}
