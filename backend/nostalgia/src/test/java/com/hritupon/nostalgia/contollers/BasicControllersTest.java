package com.hritupon.nostalgia.contollers;

import com.hritupon.nostalgia.properties.NostalgiaProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by hritupon on 23/8/17.
 */
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class BasicControllersTest {
    public static final String WELCOME_MESSAGE = "Welcome message";
    private MockMvc mockMvc;
    @Mock
    NostalgiaProperties nostalgiaProperties;
    @InjectMocks
    BasicControllers basicControllers;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = standaloneSetup(basicControllers).build();
        Mockito.when(nostalgiaProperties.getMessage()).thenReturn(WELCOME_MESSAGE);
    }

    @Test
    public void home() throws Exception {
        this.mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string(WELCOME_MESSAGE));
    }

}