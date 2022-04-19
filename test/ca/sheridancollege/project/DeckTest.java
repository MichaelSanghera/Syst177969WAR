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
public class DeckTest {
    
    public DeckTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getFromShuffledDeck method, of class Deck.
     */
    @Test
    public void testGetFromShuffledDeck() {
       
        System.out.println("getFromShuffledDeck");
        int x = 0;
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.getFromShuffledDeck(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("Shuffle");
        Deck instance = new Deck();
        instance.Shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
