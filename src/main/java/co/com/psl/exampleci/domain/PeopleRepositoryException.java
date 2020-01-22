package co.com.psl.exampleci.domain;

import java.io.IOException;

public class PeopleRepositoryException extends Exception {

	public PeopleRepositoryException(IOException e) {
		super(e);
	}

	private static final long serialVersionUID = -3215916982371359502L;

}
