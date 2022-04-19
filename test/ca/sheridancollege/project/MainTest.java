/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] arg = null;
        Main.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of war method, of class Main.
     */
    @Test
    public void testWar() {
        System.out.println("war");
        Main.war();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endwar method, of class Main.
     */
    @Test
    public void testEndwar() {
        System.out.println("endwar");
        Main.endwar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shift method, of class Main.
     */
    @Test
    public void testShift() {
        System.out.println("shift");
        List<Card> warDeck = null;
        Main.shift(warDeck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
