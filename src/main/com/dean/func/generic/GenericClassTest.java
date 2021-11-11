package main.com.dean.func.generic;

import static org.junit.jupiter.api.Assertions.*;

class GenericClassTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testInitGenericClass(){
        GenericClass<Long> gc = new GenericClass<Long>();
        GenericClass<String> gc2 = new GenericClass<String>();
        gc.setVal(12L);
        long a = gc.getVal();
        long b = 12;
        assertEquals(a,b);
    }
}