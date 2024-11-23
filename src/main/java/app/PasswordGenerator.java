package app;
import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGenerator {
    public static String generatePassword(int length) {
       return RandomStringUtils.randomAlphanumeric(length);
    }


}
