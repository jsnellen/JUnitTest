package edu.jsu.mcis.cs310;

import org.junit.*;
import static org.junit.Assert.*;

public class ExampleTest {

    private Main main;
    private String expected;
    
    @Before
    public void setUp() {
        main = new Main();
        expected = "Hello, World!";
    }
        
    @Test
    public void testGreeting() {
        String actual = main.getGreeting();
        assertEquals(expected, actual);
    }
    
}