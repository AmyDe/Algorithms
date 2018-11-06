package com.example.timingtests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DuplicatesTest {

    @Test
    public void unitTest() {
        Duplicates testes = new Duplicates();
        Assert.assertEquals(10, testes.testTen());
        System.out.println("Unit test finished without error.");
    }

}