package edu.ithaca.afolabi;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringCalculator mtSC =new StringCalculator();

        //empty string
        String teststring="";
        int addret =mtSC.Add(teststring);
        assertEquals(0,addret);
        //one number
        String teststring2="1";
        int addret2 =mtSC.Add(teststring2);
        assertEquals(1,addret2);

        String teststring3="-5";
        int addret3 =mtSC.Add(teststring3);
        assertEquals(-5,addret3);

        String teststring4="0";
        int addret4 =mtSC.Add(teststring4);
        assertEquals(0,addret4);
        //two num
        String teststring5="0,1";
        int addret5 =mtSC.Add(teststring5);
        assertEquals(1,addret5);
        String teststring6="3,3";
        int addret6 =mtSC.Add(teststring6);
        assertEquals(6,addret6);
        String teststring7="-2,1";
        int addret7=mtSC.Add(teststring7);
        assertEquals(-1,addret7);
        String teststring8="-2,-1";
        int addret8=mtSC.Add(teststring8);
        assertEquals(-3,addret8);
        String teststring9="-2,0";
        int addret9=mtSC.Add(teststring9);
        assertEquals(-2,addret9);

        //any number
        String teststring10="-2,0,1,-6";
        int addret10=mtSC.Add(teststring10);
        assertEquals(-7,addret10);

        String teststring11="2,3,1,6";
        int addret11=mtSC.Add(teststring11);
        assertEquals(12,addret11);


        //adding a comment here just to make a change
        String teststring12="1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        int addret12=mtSC.Add(teststring12);
        assertEquals(40,addret12);

        String teststring13="2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        int addret13=mtSC.Add(teststring13);
        assertEquals(41,addret13);


    }
}