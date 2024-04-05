
package Pages.base

import geb.Page

abstract class WUPage extends Page {

    static ConfigObject config

    static at = {
        //we will check this for all pages derived from this page
        browser.getCurrentUrl().toLowerCase().startsWith(config.urlWithoutForwardSlash)
    }

}