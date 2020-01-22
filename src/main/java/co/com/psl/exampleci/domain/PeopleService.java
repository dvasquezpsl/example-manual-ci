package co.com.psl.exampleci.domain;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PeopleService implements IPeopleService {

  private IPeopleRepository repository;

  public PeopleService(IPeopleRepository repository) {
    this.repository = repository;
  }

  public int getAge(String personId) {
    Person personInfo;
    try {
      personInfo = repository.getPersonInfo(personId);
    } catch (PeopleRepositoryException e) {
      throw new PeopleServiceException(e);
    }
    Long age = ChronoUnit.YEARS.between(personInfo.getBirth(), LocalDateTime.now());
    return age.intValue();
  }

}
