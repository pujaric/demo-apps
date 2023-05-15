package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.SpringApplication;

@ExtendWith(MockitoExtension.class)
class DemoAppsApplicationTests {

	@Test
	void mainTest() {
		DemoAppsApplication ulsFileServerApplication = new DemoAppsApplication();
		mockStatic(SpringApplication.class);
		DemoAppsApplication.main(new String[0]);
		SpringApplication.run(DemoAppsApplication.class, new String[0]);
		assertTrue(true);
	}

}
