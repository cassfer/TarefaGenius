package br.com.fernandes.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TarefaGeniusControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testCheckHealth() throws Exception{
		MvcResult result = mockMvc.perform(get("/tarefa/health")).andReturn();
		
		int status = result.getResponse().getStatus();
		String content = result.getResponse().getContentAsString();
		
		assertEquals(200, status);
		assertEquals("Aplicação está saudável", content);
		
	}
	
}
