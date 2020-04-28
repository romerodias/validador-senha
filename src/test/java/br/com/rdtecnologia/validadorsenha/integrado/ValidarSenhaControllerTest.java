package br.com.rdtecnologia.validadorsenha.integrado;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ValidarSenhaControllerTest {

    @Autowired
    private MockMvc mvc;
[]
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void senhaValida() throws Exception {
       ResultActions resultActions = mvc.perform(post("/senha/validar")
            .contentType("application/json")
            .param("senha", "AbTp9!foo")
            .content(objectMapper.writeValueAsString("")))
            .andExpect(status().isOk());
        MvcResult mvcResult = resultActions.andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().equals("true"));
    }

    @Test
    void senhaInvalida() throws Exception {
        ResultActions resultActions = mvc.perform(post("/senha/validar")
                .contentType("application/json")
                .param("senha", "AAAbbbCc")
                .content(objectMapper.writeValueAsString("")))
                .andExpect(status().isOk());
        MvcResult mvcResult = resultActions.andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().equals("false"));
    }

}
