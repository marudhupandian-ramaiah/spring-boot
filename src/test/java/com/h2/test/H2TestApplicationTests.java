package com.h2.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.h2.demo.H2TestApplication;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=H2TestApplication.class)
public class H2TestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
