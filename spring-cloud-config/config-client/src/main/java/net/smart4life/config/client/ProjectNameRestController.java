package net.smart4life.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProjectNameRestController {

	@Autowired
	private GreetingService greetingService;

	@RequestMapping("/project-name")
	public String projectName() {
		return greetingService.sayHello();
	}

}
