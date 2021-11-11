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
    @org.junit.jupiter.api.Test
    void testWarpType(){
        GenericClass<String> sgc = new GenericClass<>();
        GenericClass<Long> lgc = new GenericClass<>();
        assertEquals(sgc.getClass(), lgc.getClass());
        System.out.println(sgc.getClass() == lgc.getClass());
        System.out.println(sgc.getClass().getName());
    }
}