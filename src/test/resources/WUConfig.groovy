
environments {
    test {
        urlWithoutForwardSlash = "https://www.westernunion.com"
        urlWithoutForwardSlash = urlWithoutForwardSlash.toLowerCase()
        urlWithForwardSlash = urlWithoutForwardSlash + "/"
    }

    prod {
        urlWithoutForwardSlash = "https://www.westernunion.com"
        urlWithoutForwardSlash = urlWithoutForwardSlash.toLowerCase()
        urlWithForwardSlash = urlWithoutForwardSlash + "/"
    }
}
