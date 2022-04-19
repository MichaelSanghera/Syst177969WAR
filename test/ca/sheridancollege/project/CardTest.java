/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
   final Card c = new Card();
        final Field field = pojo.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(pojo, "magic_values");

        //when
        final String result = pojo.getValue();

        //then
        assertEquals("field wasn't retrieved properly", result, "magic_values");
    }

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = null;
        Suit expResult = null;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Card.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Card instance = null;
        String expResult = "";
        String result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
