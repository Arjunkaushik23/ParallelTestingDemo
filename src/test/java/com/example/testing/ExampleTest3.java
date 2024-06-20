package com.example.testing;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@SpringBootTest
public class ExampleTest3 {

    @Test
    public void testMethod3() {
        assertEquals(3, 3);
    }
}
