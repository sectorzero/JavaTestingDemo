package com.fooorg.fooproj.example;

import com.fooorg.fooproj.framework.test.FooProjUnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(FooProjUnitTest.class)
public class HolaTest {

    @Test
    public void test_1() {
        assertNotNull(Hola.generateTag());
    }

    @Test
    public void test_2() {
        assertEquals(38, Hola.generateTag().length());
    }
}
