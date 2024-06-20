package com.example.testing;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@SpringBootTest
public class ExampleTest2 {

    @Test
    public void testMethod2() {
        assertEquals(2, 2);
    }
}
