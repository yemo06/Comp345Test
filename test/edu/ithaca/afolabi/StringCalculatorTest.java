package edu.ithaca.afolabi;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringCalculator mtSC =new StringCalculator();

        String teststring="";
        int addret =mtSC.Add(teststring);
        assertEquals(0,addret);
        
        String teststring2="1";
        int addret2 =mtSC.Add(teststring);
        assertEquals(1,addret2);

        String teststring3="-5";
        int addret3 =mtSC.Add(teststring);
        assertEquals(1,addret3);

        String teststring4="0";
        int addret4 =mtSC.Add(teststring);
        assertEquals(1,addret4);

    }
}