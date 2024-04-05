package Pages.Common

import Pages.base.WUPage
import org.openqa.selenium.By

class RegistrationPage extends WUPage {

    static content = {
        firstName()  { $("input#firstName") }
        middleName()  { $("input#middleName") }
        lastName() { $("input#lastName")}
        DOB() {$(By.id("dob"))}
    }

    static at = {
        firstName.isDisplayed()
    }

    def signUp(){
        firstName.value("mahendar")
        middleName.value("reddy")
        lastName.value("mahi")
        DOB.value("02/01/2024")
    }

}
