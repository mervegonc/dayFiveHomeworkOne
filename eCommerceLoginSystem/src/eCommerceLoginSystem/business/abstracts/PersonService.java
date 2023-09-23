package eCommerceLoginSystem.business.abstracts;

import eCommerceLoginSystem.entities.concretes.Person;

public interface PersonService {
	void register(Person person);
	void registerWithGoogle(Person person);
	void login(Person person,String email, String password);
	void delete(Person person);
}
