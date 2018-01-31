package edu.ithaca.afolabi;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringCalculator mtSC =new StringCalculator();

        String teststring="";
        int addret =mtSC.Add(teststring);
        assertEquals(0,addret);



    }
}