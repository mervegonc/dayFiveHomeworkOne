package eCommerceLoginSystem.core.abstracts;

public interface EmailService {
	void sendVerificationEmail();
	boolean checkEmail();
}
