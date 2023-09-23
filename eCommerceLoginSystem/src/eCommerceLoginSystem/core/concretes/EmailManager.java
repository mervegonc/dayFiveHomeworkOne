package eCommerceLoginSystem.core.concretes;


import eCommerceLoginSystem.core.abstracts.EmailService;


public class EmailManager implements EmailService{

	@Override
	public void sendVerificationEmail() {
		System.out.println("Verification Email Send to Person");
		
	}

	@Override
	public boolean checkEmail() {
		// TODO Auto-generated method stub
		return false;
	}

}
