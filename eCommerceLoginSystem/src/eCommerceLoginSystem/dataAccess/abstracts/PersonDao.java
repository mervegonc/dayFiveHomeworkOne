package eCommerceLoginSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceLoginSystem.entities.concretes.Person;

public interface PersonDao {
	void add(Person person);
	void update(Person person);
	void delete(Person person);
	Person getEmail(String email);
	List<Person>getAll();
	
}
