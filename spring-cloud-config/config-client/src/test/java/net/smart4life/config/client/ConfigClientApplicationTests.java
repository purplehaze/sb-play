package net.smart4life.config.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
//@TestPropertySource(locations="classpath:test.properties")
public class ConfigClientApplicationTests {

	@Value("${configclient.projectName}")
	private String projectName;
	
	@Autowired
	private ConfigProps props;
	
	@Autowired
	private GreetingService greetingService;
	
	@Test
	public void contextLoads() {
		System.out.println("!!!!!!!!!!!!!!!!!!! "+greetingService.sayHello());
	}

}
