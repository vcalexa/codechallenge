package com.safereach.codechallenge;

import com.safereach.codechallenge.donottouch.Data;
import com.safereach.codechallenge.donottouch.DoNotTouchProcessor;
import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@SpringBootTest
class SafeReachCodeChallengeApplicationTests {

	@Autowired
	private RunController runController;

	@Autowired
	private DoNotTouchProcessor doNotTouchProcessor;

	@Test
	void contextLoads() throws Exception{
		assertThat(runController,is(IsNull.notNullValue()));
		assertThat(doNotTouchProcessor,is(IsNull.notNullValue()));
	}

	@Test
	void smokeTestDoNotTouchProcessor() {
		List<Data> result= doNotTouchProcessor.run();
		assertThat(result, is(IsNull.notNullValue()));
	}

	@Test
	void smokeTestRunController() {
		String result = runController.run();
		assertThat(result, is(IsNull.notNullValue()));
	}

}
