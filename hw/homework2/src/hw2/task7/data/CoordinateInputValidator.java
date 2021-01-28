package hw2.task7.data;

import hw2.interfaces.InputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoordinateInputValidator implements InputValidator {

    private final Pattern numberPattern = Pattern.compile("^\\d*[\\.|,]?\\d+$");

    @Override
    public boolean isValid(String inputString) {

        if (inputString != null) {
            String testString = inputString.trim();
            Matcher numberMatcher = numberPattern.matcher(testString);
            return numberMatcher.find();
        }

        return false;
    }

}