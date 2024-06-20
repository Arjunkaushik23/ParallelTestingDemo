package com.example.testing;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@SpringBootTest
public class ExampleTest1 {

    @Test
    public void testMethod1() {
        assertEquals(1, 1);
    }
}
