package me.guillaume.playground.adapters.api;

import me.guillaume.playground.application.PippoService;
import me.guillaume.playground.infrastructure.persistence.Pippo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import static java.util.List.of;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

class PippoControllerTest {

    private PippoService pippoService;
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.pippoService = mock(PippoService.class);
        this.mockMvc = standaloneSetup(new PippoController(pippoService)).build();
    }

    @Test
    public void shouldPippoTwice() throws Exception {

        when(pippoService.pippos()).thenReturn(of(new Pippo("pippo"), new Pippo("pippo2")));

        mockMvc.perform(get("/pippo"))
                .andExpect(status().isOk())
                .andExpect(content().string("[\"pippo\",\"pippo2\"]"));
    }
}