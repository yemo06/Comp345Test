package edu.ithaca.afolabi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    int Add(String test){
        if(test.equals("")){
            return 0;
        }
        else {
            int total =0;
            List<String> stringa = new ArrayList<String>(Arrays.asList(test.split(",")));
            for (int i = 0; i <stringa.size() ; i++) {
                System.out.println(stringa);
                total+=(Integer.parseInt(stringa.get(i)));

            }
            return total;


        }

        //return 0;

    }


}
