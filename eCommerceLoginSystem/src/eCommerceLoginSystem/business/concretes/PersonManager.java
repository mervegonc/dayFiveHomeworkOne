package eCommerceLoginSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceLoginSystem.business.abstracts.PersonService;
import eCommerceLoginSystem.core.abstracts.EmailService;
import eCommerceLoginSystem.core.abstracts.RegisterService;
import eCommerceLoginSystem.dataAccess.abstracts.PersonDao;
import eCommerceLoginSystem.entities.concretes.Person;

public class PersonManager implements PersonService{

	private RegisterService registerService;
	private EmailService emailService;
	private PersonDao personDao;
	
	
	
	public PersonManager(PersonDao personDao, EmailService emailService, RegisterService registerService) {
		super();
		this.registerService = registerService;
		this.emailService = emailService;
		this.personDao = personDao;
	}

	@Override
	public void register(Person person) {
		if(person.getPassWord().length()<6) {
			System.out.println("Password Must be More Than 6 Digits");
		return;
		}
		final String email_pattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		final Pattern pattern = Pattern.compile(email_pattern);
		Matcher matcher = pattern.matcher(person.getEmail());
		
		if(!matcher.matches()) {
			System.out.println("Mail Format İs Not Acceptable");
			return;
		}
		for(Person persons : personDao.getAll()) {
			if(person.getEmail() == person.getEmail()) {
				System.out.println("Person Email Registered To The System");
				return;
			}
			
		}
		
		if(person.getFirstName().length() < 2 || person.getLastName().length()<2){
			System.out.println("First Name And Last Name Miust Consist Of At Least 2 Values");
			return;
		}
	}
	

	@Override
	public void registerWithGoogle(Person person) {
		if(registerService.register(person)) {
			System.out.println("Registration Completed Successfully With Google Service");
		}else {
			System.out.println("Registration Could Not Completed  With Google Service");
		}
		
	}

	@Override
	public void login(Person person, String email, String password) {
		if(person.getEmail().equals(email) && person.getPassWord().equals(password)) {
			System.out.println(person.getEmail()+" Login İs Succesfuly Completed");
		}else {
			System.out.println("Your Login Information İs İncorrect");
		}
	}
	
	@Override
	public void delete(Person person) {
		System.out.println(person.getEmail()+" İs Deleted Permanently From the System");
		
	}
	
}
