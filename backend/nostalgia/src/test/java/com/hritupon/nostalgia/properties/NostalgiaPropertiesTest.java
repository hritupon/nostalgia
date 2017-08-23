package com.hritupon.nostalgia.properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

/**
 * Created by hritupon on 23/8/17.
 */
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class NostalgiaPropertiesTest {

    public static final String MESSAGE = "message";
    NostalgiaProperties nostalgiaProperties=null;

    @Before
    public void setUp() throws Exception {
        nostalgiaProperties = new NostalgiaProperties();
    }

    @Test
    public void getMessage() throws Exception {
        nostalgiaProperties.setMessage(MESSAGE);
        assertEquals(nostalgiaProperties.getMessage(),MESSAGE);

    }

    @Test
    public void setMessage() throws Exception {
        nostalgiaProperties.setMessage(MESSAGE);
        assertEquals(nostalgiaProperties.getMessage(),MESSAGE);
    }

}