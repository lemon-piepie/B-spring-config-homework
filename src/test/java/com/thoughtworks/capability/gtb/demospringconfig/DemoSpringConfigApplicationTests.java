package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoSpringConfigApplicationTests {
	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		assertEquals("basic",levelController.getLevel());
	}

}

@SpringBootTest
@ActiveProfiles("test2")
class DemoSpringConfigApplicationTests2 {
	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		assertEquals("advanced",levelController.getLevel());
	}

}

@SpringBootTest
@ActiveProfiles("test3")
class DemoSpringConfigApplicationTests3 {
	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		assertEquals("advanced",levelController.getLevel());
	}

}