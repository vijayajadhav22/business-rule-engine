package business.rule.engine.serviceimpl;

public class UserValidator {
	public boolean HasValidEmail(String email)
    {
        if (email.contains("@") && email.contains("."))
        {
            return true;
        }

        return false;
    }
}
