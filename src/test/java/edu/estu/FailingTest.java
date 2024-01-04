package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

    @Test(timeout = 1000)
    public void testInfiniteLoop() {
        try {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            assertTrue(false); // Infinite loop did not accure
        } catch (Throwable e) {
            assertTrue(true); // Failed because of infinite loop
        }
    }

}
