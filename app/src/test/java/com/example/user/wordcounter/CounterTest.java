package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 08/08/2017.
 */

public class CounterTest {

    String inputString;

    @Before
    public void before() {
        inputString = new String("This is a test");
    }

    @Test
    public void testWordCounter() {
        assertEquals(4, Counter.countWords(inputString));
    }

}
