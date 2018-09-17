package main;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Training.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Training training = (Training)unmarshaller.unmarshal(new File("persons.xml"));
		System.out.println("Training name: " + training.getName());
		
		List<Person> persons = training.getPersons();
		for(Person person : persons)
		{
			System.out.println("Name: " + person.getName());
			System.out.println("id: " + person.getId());
		}
	}
}