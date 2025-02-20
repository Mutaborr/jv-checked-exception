package core.basesyntax;

public class PasswordValidator {

    private static final int checkLength = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                || !(password.length() >= checkLength)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
