package business.rule.engine.serviceimpl;

import business.rule.engine.service.IEmailService;

public class EmailService implements IEmailService
    {
        private UserValidator userValidator;

        public EmailService()
        {
            this.userValidator = new UserValidator();
        }

        public boolean SendEmail(String recipient, String subject, String body)
        {
            return userValidator.HasValidEmail(recipient);
        }
 }

