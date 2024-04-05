import Pages.Common.HomePage
import Pages.Common.RegistrationPage

import Pages.base.WUPage
import geb.spock.GebReportingSpec
import spock.lang.Shared

class RegisterSpec extends GebReportingSpec {

    @Shared cfg

    def setupSpec() {
        cfg = ConfigReader.getConfiguration()
        WUPage.config = cfg;
    }

    def cleanupSpec() {
    }

    def setup() {
        baseUrl = cfg.urlWithForwardSlash
    }


    def "Navigate to WU page and register the user" () {

        given: "You are on homepage"
        to HomePage

        when: "Navigate to signup page"
        HomePage homePage = at HomePage
        homePage.clickOnSignUp()

        and: "complete the signup"
        RegistrationPage registrationPage = at RegistrationPage
        registrationPage.signUp()

        then:
        print("successfully completed the registration process...")

    }


}

