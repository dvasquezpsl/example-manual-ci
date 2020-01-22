package co.com.psl.exampleci.infrastructure;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.psl.exampleci.domain.IPeopleRepository;
import co.com.psl.exampleci.domain.PeopleRepositoryException;
import co.com.psl.exampleci.domain.Person;

public class PeopleRepository implements IPeopleRepository {
	
	public Person getPersonInfo(String id) throws PeopleRepositoryException {
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("database.properties");
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(inputStream, Person.class);
		} catch (IOException e) {
			throw new PeopleRepositoryException(e);
		}
	}
}
