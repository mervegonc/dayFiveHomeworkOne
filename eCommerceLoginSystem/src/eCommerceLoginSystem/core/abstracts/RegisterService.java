package eCommerceLoginSystem.core.abstracts;

import eCommerceLoginSystem.entities.concretes.Person;

public interface RegisterService {
	boolean register(Person person);
}
