/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class ValueTest {
    
    public ValueTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of values method, of class Value.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Value[] expResult = null;
        Value[] result = Value.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Value.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Value expResult = null;
        Value result = Value.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValuePoints method, of class Value.
     */
    @Test
    public void testGetValuePoints() {
        System.out.println("getValuePoints");
        Value instance = null;
        int expResult = 0;
        int result = instance.getValuePoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Value.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Value instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
