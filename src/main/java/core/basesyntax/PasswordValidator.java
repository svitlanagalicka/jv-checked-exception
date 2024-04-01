package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null && repeatPassword == null) {
            throw new PasswordValidationException("Wrong passwords");
        } else {
            if (!password.equals(repeatPassword)) {
                throw new PasswordValidationException("Wrong passwords");
            } else {
                if (repeatPassword.length() < 10 && password.length() < 10) {
                    throw new PasswordValidationException("Wrong passwords");
                }
            }
        }
    }
}
