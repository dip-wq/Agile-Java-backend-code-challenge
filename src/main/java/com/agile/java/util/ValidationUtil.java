package com.agile.java.util;

import com.agile.java.exception.InvalidURLException;

import static com.agile.java.constants.UrlShortenerConstants.INVALID_URL_MESSAGE;
import static com.agile.java.constants.UrlShortenerConstants.VALID_URL_PATTERN;

public class ValidationUtil {
    public static void validateUrl(String url) {
        if (url == null || !url.matches(VALID_URL_PATTERN)) {
            throw new InvalidURLException(String.format(INVALID_URL_MESSAGE,url));
        }
    }
}
