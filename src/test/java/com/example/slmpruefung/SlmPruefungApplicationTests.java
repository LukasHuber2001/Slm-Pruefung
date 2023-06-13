package com.example.slmpruefung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmPruefungApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void testDigitSum() {
        SlmPruefungApplication slm = new SlmPruefungApplication();
        assertEquals(10, slm.digitSum(1234));
    }
    @Test
    void testCountSum(){
        SlmPruefungApplication slm = new SlmPruefungApplication();
        slm.digitSum(1234);
        assertEquals(1,slm.countDigitSum());
    }
}
