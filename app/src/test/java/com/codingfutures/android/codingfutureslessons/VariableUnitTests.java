package com.codingfutures.android.codingfutureslessons;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class VariableUnitTests {

    @Test
    public void DayOfMonthIs13() throws Exception {
        assertTrue("Day of month is 13", dayOfMonth == 13);
    }

    @Test
    public void NameIsJohnDoe() throws Exception {
        assertTrue("Name is John Doe", name == "John Doe");
    }

    @Test
    public void OuncesInAPound() throws Exception {
        assertTrue("There are 16 ounces in a pound", ouncesInPound == 16f);
    }

    @Test
    public void BestLetterIsC() throws Exception {
        assertTrue("The best letter is C", bestLetter == 'C');
    }

    @Test
    public void TrueIsTrue() throws Exception {
        assertTrue("True is true", True == true);
    }
}