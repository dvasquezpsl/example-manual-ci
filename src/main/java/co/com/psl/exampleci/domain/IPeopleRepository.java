package co.com.psl.exampleci.domain;

public interface IPeopleRepository {
	
	public Person getPersonInfo(String id) throws PeopleRepositoryException;

}
