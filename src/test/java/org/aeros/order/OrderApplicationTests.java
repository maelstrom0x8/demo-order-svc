package org.aeros.order;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aeros.order.common.AbstractIntegrationTest;
import org.junit.jupiter.api.Test;

class OrderApplicationTests extends AbstractIntegrationTest {

	@Test
	void contextLoads() throws Exception {
		mvc.perform(get("/actuator/health"))
				.andExpect(status().isOk());
	}

}
