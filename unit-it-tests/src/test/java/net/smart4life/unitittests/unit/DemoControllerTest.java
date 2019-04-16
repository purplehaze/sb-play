package net.smart4life.unitittests.unit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import net.smart4life.unitittests.DemoController;
import net.smart4life.unitittests.SomeBusinessService;

@RunWith(MockitoJUnitRunner.class)
public class DemoControllerTest {

	@Mock
	private SomeBusinessService mockSomeBusinessService;
	
	private DemoController		demoController;
	
	@Before
	public void init() {
		demoController = new DemoController(mockSomeBusinessService);
	}

	@Test
	public void shouldRetrieveAnEntity() {
		// Given
		Mockito.when(this.mockSomeBusinessService.findEntity("blah")).thenReturn("Hello blah");
		// When
		ResponseEntity<String> actualResponse = this.demoController.findEntity("blah");
		// Then
		assertThat(actualResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(actualResponse.getBody()).isEqualTo("Hello blah");
	}
}
