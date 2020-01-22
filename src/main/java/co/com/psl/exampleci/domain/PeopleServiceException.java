package co.com.psl.exampleci.domain;

public class PeopleServiceException extends RuntimeException {

  private static final long serialVersionUID = 4492181765221615920L;

  public PeopleServiceException(PeopleRepositoryException e) {
    super(e);
  }

}
