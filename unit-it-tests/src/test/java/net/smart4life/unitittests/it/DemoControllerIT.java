package net.smart4life.unitittests.it;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.apache.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.smart4life.unitittests.UnitItTestsApp;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { UnitItTestsApp.class })
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoControllerIT {

	@LocalServerPort
	private int port;

	@Before
	public void setup() {
		RestAssured.port = this.port;
	}

	@Test
	public void shouldRetrieveAnEventById() {
		String body = RestAssured
				.given()
				.accept(ContentType.JSON)
				.when()
				.get("/api/entities/blah")
				.then()
				.statusCode(HttpStatus.SC_OK)
				.contentType(ContentType.JSON)
				.extract()
				.asString();

		assertThat(body).isEqualTo("Hello blah");

	}
}
