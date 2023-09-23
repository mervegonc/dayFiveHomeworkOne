package eCommerceLoginSystem.core.concretes;

import eCommerceLoginSystem.core.abstracts.RegisterService;
import eCommerceLoginSystem.entities.concretes.Person;
import eCommerceLoginSystem.google.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegisterService{

	@Override
	public boolean register(Person person) {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.register(person);
		return true;
	}



}
