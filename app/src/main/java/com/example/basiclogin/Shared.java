package com.example.basiclogin;
import java.util.regex.Pattern;

/**
 * A class to share the regular expressions to be used to validate the inputs
 */
public class Shared {
  protected static final Pattern DATE_REGEX =
      Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
  protected static final Pattern EMAIL_REGEX =
      Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
}
