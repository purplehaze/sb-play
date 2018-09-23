package net.smart4life.config.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@TestPropertySource(locations="classpath:test.properties")
public class TestConfig {

	@Bean
	public GreetingService greetingService() {
		return new GreetingService();
	}
}
