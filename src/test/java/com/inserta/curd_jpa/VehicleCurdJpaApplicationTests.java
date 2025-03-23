package com.inserta.curd_jpa;

import com.inserta.curd_jpa.entity.Vehicle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
class VehicleCurdJpaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void shouldGetAllVehicles() throws Exception {
		mockMvc.perform(get("/api/vehicles"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON));
	}

	@Test
	void shouldCreateVehicle() throws Exception {
		Vehicle vehicle = new Vehicle("Ford", "Astra", "GY2587", "Sedan");

		mockMvc.perform(post("/api/articles")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(article)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("Laptop"))
				.andExpect(jsonPath("$.description").value("High-performance laptop"));
	}

	@Test
	void shouldReturnNotFoundForInvalidId() throws Exception {
		mockMvc.perform(get("/api/vehicles/9999"))
				.andExpect(status().isNotFound());
	}

}
