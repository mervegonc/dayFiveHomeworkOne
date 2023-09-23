package eCommerceLoginSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceLoginSystem.dataAccess.abstracts.PersonDao;
import eCommerceLoginSystem.entities.concretes.Person;

public class InMemoryPerson implements PersonDao{

	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getEmail()+"Added To The System");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getEmail()+"Updated In The System");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getEmail()+"Deleted From The System");
		
	}

	@Override
	public Person getEmail(String email) {
		return null;
		
	}

	List<Person> persons = new ArrayList<Person>();
	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return this.persons;
	}

}
