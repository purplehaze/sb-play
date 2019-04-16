package net.smart4life.unitittests;

import org.springframework.stereotype.Service;

@Service
public class SomeBusinessService {

	public String findEntity(String id) {
		return "Hello "+id;
	}
}
