package eCommerceLoginSystem;

import java.util.List;

import eCommerceLoginSystem.business.abstracts.PersonService;
import eCommerceLoginSystem.business.concretes.PersonManager;
import eCommerceLoginSystem.core.concretes.EmailManager;
import eCommerceLoginSystem.core.concretes.GoogleRegisterManagerAdapter;
import eCommerceLoginSystem.dataAccess.concretes.InMemoryPerson;
import eCommerceLoginSystem.entities.concretes.Person;

public class Main {

	public static void main(String[] args) {
		PersonService personService = new PersonManager(
				new InMemoryPerson(),
				new EmailManager(),
				new GoogleRegisterManagerAdapter());

		Person person1 = new Person(1, "Merve", "Göncü", "merve.gnc.946@gmail.com", "123456789Java");
		personService.register(person1);
		personService.registerWithGoogle(person1);
		personService.login(person1, "merve.gnc.946@gmail.com", "123456789Java");
		
		

}
}
