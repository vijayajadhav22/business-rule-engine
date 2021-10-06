package business.rule.engine.service;

public interface IEmailService {
	public boolean SendEmail(String recipient, String subject, String body);
}
