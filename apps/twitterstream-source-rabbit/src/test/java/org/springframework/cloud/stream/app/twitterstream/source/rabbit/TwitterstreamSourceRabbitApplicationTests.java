package org.springframework.cloud.stream.app.twitterstream.source.rabbit;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

// OPTION 1: Add the test support class here.
// package derived from the app name, class name by convention?

//@SpringApplicationConfiguration(classes = {
//		org.springframework.cloud.stream.app.test.twitterstream.TwitterStreamTestConfiguration.class,
//		TwitterstreamSourceRabbitApplication.class })
@SpringApplicationConfiguration(classes = TwitterstreamSourceRabbitApplication.class)
public class TwitterstreamSourceRabbitApplicationTests {

	@Test
	public void contextLoads() {
	}

}
