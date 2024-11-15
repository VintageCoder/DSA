package com.abc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class TransactionTest {
    @Test
    public void transaction() {
        double amount=5;
        Transaction t = new Transaction(amount);
        assertTrue(t instanceof Transaction);
        assertEquals(amount,t.amount,0);
        assertNotNull(t.transactionDate);
    }
}
