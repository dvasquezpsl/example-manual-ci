package co.com.psl.exampleci.application;

import co.com.psl.exampleci.domain.IPeopleRepository;
import co.com.psl.exampleci.domain.IPeopleService;
import co.com.psl.exampleci.domain.PeopleService;
import co.com.psl.exampleci.infrastructure.PeopleRepository;

public class Main {

	public static void main(String[] args) {
	    IPeopleRepository repository = new PeopleRepository();
		IPeopleService service = new PeopleService(repository);
		int age = service.getAge("123456");
		System.out.println(age);
	}

}
