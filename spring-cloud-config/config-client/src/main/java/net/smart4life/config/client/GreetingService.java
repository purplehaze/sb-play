package net.smart4life.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class GreetingService {
	
	@Value("${configclient.projectName}")
	private String projectName;
	
	@Autowired
	private ConfigProps props;
	
	public String sayHello() {
		return this.projectName+" says: "+props.getHelloFrom();
	}

}
