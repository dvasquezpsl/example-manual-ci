package co.com.psl.exampleci.infrastructure;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import co.com.psl.exampleci.domain.IPeopleRepository;
import co.com.psl.exampleci.domain.PeopleRepositoryException;
import co.com.psl.exampleci.domain.Person;

public class PeopleRepository implements IPeopleRepository {

  public Person getPersonInfo(String id) throws PeopleRepositoryException {
    try {
      InputStream inputStream = getClass().getClassLoader().getResourceAsStream("people/" + id + ".json");
      ObjectMapper objectMapper = getObjectMapper();
      return objectMapper.readValue(inputStream, Person.class);
    } catch (IOException e) {
      throw new PeopleRepositoryException(e);
    }
  }

  private ObjectMapper getObjectMapper() {
    LocalDateTimeDeserializer localDateTimeDeserializer = new LocalDateTimeDeserializer(
        DateTimeFormatter.ISO_DATE_TIME);
    JavaTimeModule javaTimeModule = new JavaTimeModule();
    javaTimeModule.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(javaTimeModule);
    return objectMapper;
  }
}
