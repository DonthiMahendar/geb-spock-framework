package Pages.Common

import Pages.base.WUPage

class HomePage extends WUPage {

    static content = {
        signupButton() {$("#sign-up-nav-item")}
    }

    static at = {
        signupButton.isDisplayed()
    }

    def clickOnSignUp(){
        signupButton.click()
    }
}