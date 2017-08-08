package com.example.user.wordcounter;

/**
 * Created by user on 08/08/2017.
 */

public class Counter {

    public static int countWords(String inputString) {
            if (inputString == null)
                return 0;
            return inputString.trim().split("\\s+").length;

    }
}
